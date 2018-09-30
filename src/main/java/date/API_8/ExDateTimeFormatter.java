package date.API_8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Locale;

/**
 * java.time.format.DateTimeFormatter — класс определяет настройки форматирования и парсинга.
 */
public class ExDateTimeFormatter {
    public static void main(String[] args) {
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:dd z", Locale.ENGLISH);

        ZonedDateTime zdt1 =
                ZonedDateTime.of(2005, 10, 30, 0, 0, 0, 0, ZoneId.of("Europe/Moscow"));

        String text = zdt1.format(formatter);
        System.out.println(text);

        TemporalAccessor ta = formatter.parse(text); // java.time.format.Parsed
        ZonedDateTime zdt2 = ZonedDateTime.from(ta);

        System.out.println("zdt1.equals(zdt2): " + zdt1.equals(zdt2));
    }
}
