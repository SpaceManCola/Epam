import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrWork {
    public static void main(String[] args) {
        String str = "Ребе, ви случайно не знаете, сколько тогда Иуда получил по нынешнему курсу?";
        Pattern p = Pattern.compile("[а-я]+");
        Matcher matcher = p.matcher(str.toLowerCase());
        String sbMax = new String(), sbMin =  new String();
        while (matcher.find()) {
            if (matcher.group().length() > sbMax.length()) {
                sbMax = matcher.group();
            }
            if ((matcher.group().length() < sbMin.length()) || (sbMin.length() == 0)) {
                sbMin = matcher.group();
            }
        }
        System.out.println("Самое длинное слово в предложении: " + sbMax.toString() + " длина: " + sbMax.length());
        System.out.println("Самое короткое слово в предложении: " + sbMin.toString() + " длина: " + sbMin.length());
    }
}
