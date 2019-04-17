package date.pattern;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 04.04.2019
 **/

public class Example_1 {
    public static void main(String[] args) {
        String dateString ="2019-04-04T21:27:45.850+03:00";
        String pattern1 = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
        //"yyyy-MM-dd'T'HH:mm:ss.SSSxx"
        DateTimeFormatter formatter1 = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern1);
        LocalDate parse = LocalDate.parse(dateString, formatter2);
        System.out.println(parse);

        String pattern2 = "yyyy-MM-dd";
        LocalDate dateToday = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern(pattern2).format(dateToday));

    }


}
