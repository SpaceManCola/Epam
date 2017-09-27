import java.util.*;

public class Collections {
    public static void main(String[] args) {
        String str = "обезьяна не любит бананы бананы не хотят быть с обезьяной";
        String[] tokensVal = str.toLowerCase().split(" ");
        Map<String, Integer> m = new HashMap<String, Integer>();
        for (String a : tokensVal) {
            Integer freq = m.get(a);
            m.put(a, (freq == null) ? 1 : freq + 1);
        }

        System.out.println(m.size() + " distinct words:");
        System.out.println(m);
    }
}