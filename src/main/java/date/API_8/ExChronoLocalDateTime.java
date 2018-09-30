package date.API_8;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.time.chrono.IsoChronology;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.ThaiBuddhistChronology;

/**
 * В новом API есть несколько календарей, которые названы хронологиями
 * сложно представить, где может потребоваться отличная от ISO-8601
 * хронология IsoChronology (которая практически эквивалентна грегорианскому календарю),
 * но новый API это поддерживает
 */

public class ExChronoLocalDateTime {
    public static void main(String[] args) {
        Clock clock = Clock.system(ZoneId.of("Europe/Moscow"));
        ZonedDateTime zdt = ZonedDateTime.now(clock);

        ChronoLocalDateTime dt1 = IsoChronology.INSTANCE.localDateTime(zdt);
        System.out.println(dt1); // 2016-01-11T18:48:15.145

        ChronoLocalDateTime dt2 = JapaneseChronology.INSTANCE.localDateTime(zdt);
        System.out.println(dt2); // Japanese Heisei 28-01-11T18:48:15.145

        ChronoLocalDateTime dt3 = ThaiBuddhistChronology.INSTANCE.localDateTime(zdt);
        System.out.println(dt3); // ThaiBuddhist BE 2559-01-11T18:48:15.145
    }
}
