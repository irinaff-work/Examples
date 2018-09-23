package serialize.test2.defaultMethod;

/**
 * Created by IFatkullina on 21.09.2018.
 * восстановление объекта из файла
 * В этом коде в 210-й строке происходит восстановление объекта
 * при помощи вызова метода ObjectInputStream.readObject().
 * Метод считывает последовательность байтов,
 * которую мы перед этим сохранили в файле, и создает "живой"
 * объект, полностью повторяющий оригинал. Поскольку readObject()
 * может считывать любой сериализуемый объект, необходимо его присвоение соответствующему типу.
 * Таким образом, из системы, в которой происходит восстановление объекта,
 * должен быть доступен файл класса. Другими словами, при сериализации не сохраняется
 * ни файл класса объекта, ни его методы, сохраняется лишь состояние объекта.

 Затем, в 360-й строке, мы просто вызываем метод getTime(),
 чтобы получить время у разложенного объекта. Время разложенного объекта сравнивается
 с текущим временем, дабы показать что механизм действительно работает так, как мы ожидаем.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;

public class InflateTime {
    public static void main(String[] args) {
        String filename = "time.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentTime time = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            time = (PersistentTime) in.readObject();
            in.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        // распечатать восстановленное время
        System.out.println("Время разложения: " + time.getTime());
        System.out.println();
        // распечатать текущее время
        System.out.println("Текущее время: " + Calendar.getInstance().getTime());
    }
}
