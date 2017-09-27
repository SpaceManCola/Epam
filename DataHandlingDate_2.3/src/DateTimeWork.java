import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.regex.*;

public class DateTimeWork {
    public static void main(String[] args) throws ParseException{
        String input = "Дана строка вида 28 февраля 2015";
        System.out.println(convertDate(input));
    }
    public static String convertDate(String input) {
        Pattern p = Pattern.compile("(0+[1-9]|[12][0-9]|3[01])\\s[A-я]+\\s((19|20)\\d\\d)");
        Matcher matcher = p.matcher(input);
        String formattedDate = null;
        while (matcher.find()) {
            DateTimeFormatter fromUser = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MMM/yyyy", Locale.ENGLISH);
            String s = matcher.group().toString();
            LocalDate dateUser = LocalDate.parse(s, fromUser);
            formattedDate = dateUser.format(myFormat);
        }
        return formattedDate;
    }
}