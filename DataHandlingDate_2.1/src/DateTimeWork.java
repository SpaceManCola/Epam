import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimeWork {
    public static void main(String[] args) {

        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(1991, 11, 17, 17, 15, 30);

        long p1 = ChronoUnit.YEARS.between(birthday, today);
        long p2 = ChronoUnit.MONTHS.between(birthday, today);
        long p3 = ChronoUnit.DAYS.between(birthday, today);
        long p4 = ChronoUnit.MINUTES.between(birthday, today);
        long p5 = ChronoUnit.SECONDS.between(birthday, today);

        System.out.println("возраст в годах " + p1 + "\nв месяцах " + p2 +
                "\nв днях " + p3 + "\nв минутах " + p4 + "\nв секундах " + p5 );
    }
}