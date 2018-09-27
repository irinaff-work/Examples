package date.API_one;

import java.util.Date;

/**
 * http://developer.alexanderklimov.ru/android/java/date.php
 * Класс Date предназначен для работы с текущими датой и временем
 * и позволяет отталкиваться от них для решения своих задач.
 * При выходе новых версий Java часть методов класса была
 * перемещена в классы Calendar и DateFormat.
 *
 * существует множество методов для получения или установки отдельных
 * компонентов времени и даты, например, getMinutes()/setMinutes() и др.
 * Все они являются устаревшими и вместо них следует использовать класс Calendar.
 *
 * java.util.Date. Его особенностью является то, что он mutable.
 * он представляет собой обертку надо long в котором задано количество
 * миллисекунд от Unix-time (00:00:00 1 января 1970)
 */
public class ExDate {
    public static void main(String[] args) {
        // Создадим объект Date
        Date date = new Date();
        //Вывод текущей даты и времени с использованием toString()
        System.out.println(date.toString());

        long millis = date.getTime();
        //С помощью метода getTime() можно отобразить количество миллисекунд,
        // прошедших с 1 января 1970 года
        System.out.println(String.valueOf(millis));
    }

}
