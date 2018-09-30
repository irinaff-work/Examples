package date.API_8;

import java.time.Duration;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * java.time.Period — описание календарной длительности (периода)
 * в виде кортежа (год, месяц, день).
 * <p>
 * java.time.Duration — описание точной длительности
 * в виде целого количества секунд и долей текущей секунды в виде наносекунд.
 */
public class ExPeriod {
    public static void main(String[] args) {

        //При добавлении Period.of(0, 0, 1)
        // мы корректно переходим на следующий календарный день
        Period period = Period.of(0, 0, 1);

        //В случае добавления Duration.of(1, ChronoUnit.DAYS)
        // мы фактически добавляем 24 часа и
        // в следующий календарный день не переходим
        Duration duration = Duration.of(1, ChronoUnit.DAYS);

        ZonedDateTime zdt0 =
                ZonedDateTime.of(2005, 10, 30, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        ZonedDateTime zdtIn1 = zdt0.plus(period);
        ZonedDateTime ztdIn2 = zdt0.plus(duration);

        ZonedDateTime ztdOut1 = ZonedDateTime.of(2005, 10, 31, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));
        ZonedDateTime ztdOut2 = ZonedDateTime.of(2005, 10, 30, 23, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        System.out.println("zdt0 + period: " + zdtIn1.equals(ztdOut1));
        System.out.println("zdt0 + duration: " + ztdIn2.equals(ztdOut1));
        System.out.println("zdt0 + duration: " + ztdIn2.equals(ztdOut2));
    }
}
