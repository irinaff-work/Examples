package date.API_one;

import java.text.SimpleDateFormat;
import java.util.Date;

//Форматирование даты с помощью SimpleDateFormat
//http://javajun.ru/%D1%80%D0%B0%D0%B1%D0%BE%D1%82%D0%B0-%D1%81-%D0%B4%D0%B0%D1%82%D0%B0%D0%BC%D0%B8-%D0%B2-java/
//Оба класса Calendar и DateFormat потоко-небезопасны.
public class ExSimpleDateFormat {

    public static void main(String[] args) {

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow =
                new SimpleDateFormat("w E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));

        //Пример получения дня недели по дате
        String date = "17.11.2016";

        // Переводим строку в дату
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        Date dayWeek = null;
        try {
            dayWeek = format.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Вывод дня недели даты на экран
        System.out.println(new SimpleDateFormat("EEEE").format(dayWeek));
    }
}
