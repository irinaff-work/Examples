package date.API_8;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

/**
 * http://javajun.ru/%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%D1%81-%D0%B4%D0%B0%D1%82%D0%B0%D0%BC%D0%B8-%D0%B2-java/
 * java.time.Instant — это новый java.util.Date, только неизменяемый,
 * с наносекундной точностью и корректным названием.
 * Внутри хранит Unix-time в виде двух полей: long с количеством секунд,
 * и int с количеством наносекунд внутри текущей секунды.
 */
public class ExInstant {
    public static void main(String[] args) {

        Instant instant = Clock.systemDefaultZone().instant();

        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());

        System.out.println(instant.toEpochMilli());

        //java.time.Instant.toString() всегда формирует текстовое представление
        // во временной зоне UTC и одинаковым форматом ISO-8601
        Instant instant1 = Clock.system(ZoneId.of("Europe/Paris")).instant();
        System.out.println(instant1.toString());

        Instant instant2 = Clock.systemUTC().instant();
        System.out.println(instant2.toString());

        Instant instant3 = Clock.systemDefaultZone().instant();
        System.out.println(instant3.toString());
    }
}
