import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrWork {
    public static void main(String[] args){
        String str = "Ребе, ви случайно не знаете, сколько тогда Иуда получил по нынешнему курсу?";
        Pattern p = Pattern.compile("[а-я]+");
        Matcher matcher = p.matcher(str.toLowerCase());
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
