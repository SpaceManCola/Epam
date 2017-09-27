import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Properties;

import java.util.UUID;

public class Template {
    static String abPath = null;

    public static void main(String[] args) {
        replaceThemAll();
    }

    private static void replaceThemAll() {
        if (abPath == null)
            abPath = newFile();
        Properties property = new Properties();
        try (FileReader input = new FileReader("src/config.properties");
             PrintWriter out = new PrintWriter(new FileWriter(abPath, true));
             BufferedReader strFile = new BufferedReader(new FileReader("src/in.txt"));) {
            property.load(input);
            String workStr;
            while ((workStr = strFile.readLine()) != null) {
                for (Map.Entry<?, ?> entry: property.entrySet()) {
                    String key = (String) entry.getKey();
                    String value = (String) entry.getValue();
                    workStr = workStr.replaceAll("\\"+key, value);
                }
                out.print(workStr +" ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String newFile() {
        UUID id = UUID.randomUUID();
        String filename = "out_" + id.toString().replaceAll("-", "") + ".txt";
        return new File(filename).getAbsolutePath();
    }
}
