package date.API_8;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * java.time.ZonedDateTime — аналог java.util.Calendar.
 * Это самый мощный класс с полной информацией о временном контексте,
 * включает временную зону, поэтому все операции со сдвигами этот класс проводит правильно.
 */
public class ExZonedDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2015, 1, 10, 0, 0, 0, 0);

        //получаем исключение, в LocalDateTime нет временной зоны,
        // а использовать временную зону по-умолчанию в новом API невозможно
        try {
            ZonedDateTime zdt = ZonedDateTime.from(ldt);
        } catch (DateTimeException e) {
            e.printStackTrace();
        }

        //как нужно
        ZonedDateTime zdt = ZonedDateTime.of(ldt, ZoneId.of("Europe/Moscow"));
    }
}
