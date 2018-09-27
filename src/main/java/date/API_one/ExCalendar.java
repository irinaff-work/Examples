package date.API_one;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * http://developer.alexanderklimov.ru/android/java/date.php
 * Абстрактный класс Calendar позволяет преобразовать время
 * в миллисекундах в более удобном виде - год, месяц, день, часы, минуты, секунды
 * Существуют также подклассы, например, GregorianCalendar.
 *
 * Для различных операций с временем таких как чтение/установка/модификация
 * отдельных календарных полей (год, месяц, день, часы, минуты, секунды и прочее)
 * существует класс java.util.Calendar.
 * при операциях помните, что месяцы идут с 0 (лучше использовать константы),
 * а дни идут с 1.
 */
public class ExCalendar {
    public static void main(String[] args) {

        //Метод getInstance() Calendar возвращает GregorianCalendar,
        // который инициализирован по умолчанию текущей датой и временем,
        // локализацией и часовым поясом
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        calendar.set(2016, Calendar.JANUARY, 5, 12, 30, 2);
        calendar.add(Calendar.DAY_OF_YEAR, -2);

        System.out.println(calendar);

        /** Так нельзя
        user.setCreated(new Date());
        user.setModified(new Date());

        // Так можно
        Date now = chronometer.getCurrentMoment();
        user.setCreated(now);
        user.setModified(now);

        // Так нельзя
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, -3);
        Date expiration = calendar.getTime();

        // Так можно
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(this.operationTimeZone)
        calendar.setTime(chronometer.getCurrentMoment());
        calendar.add(Calendar.DAY_OF_YEAR, -3);
        Date expiration = calendar.getTime();
**/

    }
}
