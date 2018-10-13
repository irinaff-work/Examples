package reflection_api.example_2;

import java.lang.reflect.Field;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;

//Определение полей класса
public class Demo_3 {
    /*
    Метод getFields() объекта Class возвращает массив открытых
    полей типа java.lang.reflect.Field, которые могут быть определены
    не только в данном классе, но также и в его родителях (суперклассе),
    либо интерфейсах, реализованных классом или его родителями.
    Класс Field позволяет получить имя поля, тип и модификаторы
     */
    public static void main(String[] args) {
        //LinkedHashSet<?> obj = new LinkedHashSet<>();
        Foo obj = new Foo();
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getFields();
        System.out.println("fields : " + fields.length);

        for (Field field : fields) {
            Class<?> fld = field.getType();

            System.out.println("Class name : " + field.getName());
            System.out.println("Class type : " + fld.getName());
        }

        /*
        Если известно наименование поля, то можно получить о нем информацию с помощью метода getField() объекта Class.
         */
        try {
            Field fld = clazz.getField("arg1");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        /*Методы getField() и getFields() возвращают только открытые члены данных класса.
        Чтобы получить все поля класса, включая закрытые и защищенные,
        необходимо использовать методы getDeclaredField() и getDeclaredFields().
        Данные методы работают точно так же, как и их аналоги getField() и getFields().

        Класс Field содержит специализированные методы для получения значений
        примитивных типов: getInt(), getFloat(), getByte() и др.
        Для установки значения поля, используется метод set().
        Для примитивных типов имеются методы setInt(), setFloat(), setByte() и др.
         */

        //Определение значений полей класса
        try {
            System.out.println("obj.arg1= " + obj.arg1);
            Field field = clazz.getField("arg1");

            String value = (String) field.get(obj);
            field.set(obj, "New value");
            System.out.println("obj.arg1= " + obj.arg1);

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
