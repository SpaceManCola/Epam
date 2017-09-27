import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StrWork {
    public static void main(String[] args) {
        String str = "Мой номер +7 (3412)123­456 НОМЕР 8 (3412) 7890­12  ИЖЕВСК +7 (3412) 34­56­78  ТЕЛЕФОН телефон телефон 89068181991";
        Pattern p = Pattern.compile("(8[\\s]*\\(3412\\)[\\s]*)|" +
                "(\\+7[\\s]*\\(3412\\)*[\\s]*)");
        Matcher matcher = p.matcher(str);
        StringBuffer a = new StringBuffer(str);
        while (matcher.find()) {
            a.replace(matcher.start(),matcher.end(),"");
            matcher = p.matcher(a);
        }
        System.out.println(a);
    }
}

