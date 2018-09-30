package date.API_8;

import java.time.*;

/*
В новом API классы java.time.LocalTime и java.time.LocalDate —
это честные кортежи значений и при записи и чтении значения
часа временная зона никак не участвует.
 */
public class ExLocalDateTime {
    public static void main(String[] args) {
        //Эти классы, как и все другие, поддерживают интерфейс java.lang.Comparable,
        // это именно сравнение временных меток, а не временных точек

        ZonedDateTime zdt1 = ZonedDateTime.of(2015, 1, 10, 15, 0, 0, 0, ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt2 = ZonedDateTime.of(2015, 1, 10, 14, 0, 0, 0, ZoneId.of("Europe/London"));
        System.out.println("zdt1.compareTo(zdt2): " + zdt1.compareTo(zdt2));

        LocalDateTime ldt1 = zdt1.toLocalDateTime();
        LocalDateTime ldt2 = zdt2.toLocalDateTime();
        System.out.println("ldt1.compareTo(ldt2): " + ldt1.compareTo(ldt2));

        //временная зона необходима при создании их из временной точки,
        // поскольку интерпретация дней-часов от нее зависит
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));

        //Исключение выбрасывается, по причине того, что временную зону взять просто неоткуда
        // (в Instant ее нет, а зону по-умолчанию не берем)
        try {
            LocalDateTime ldt = LocalDateTime.from(clock.instant());
        } catch (DateTimeException e) {
            System.out.println(e.toString());
        }
        //Но ее можно получить либо из часов java.time.Clock, либо передать дополнительно
        LocalDateTime ldt3 = LocalDateTime.ofInstant(clock.instant(), ZoneId.of("UTC"));
        System.out.println(ldt3);

        LocalDateTime ldt4 = LocalDateTime.now(clock);
        System.out.println(ldt4);

    }
}
