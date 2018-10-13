package reflection_api.example_1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo_1 {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        int number = myClass.getNumber();
        String name = null; //no getter =(
        System.out.println(number + " " + name);//output 0null

        try {
            //getDeclaredFields() возвращает массив полей класса, и private и protected
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);
            field.set(myClass, (String) "new value");
            //получение значения поля field
            name = (String) field.get(myClass);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        //System.out.println(number + " " + name);//output 0default
        printData(myClass);// output 0new value

        //Также узнать имя класса можно простым способом
        // (вернет имя класса в виде строки):
        System.out.println(MyClass.class.getName());
    }

    public static void printData(Object myClass){
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            //для вызова объекта Method используем invoke(Оbject, Args),
            // где Оbject - все также экземпляр класса MyClass.
            // Args - аргументы метода - наш таковых не имеет
            method.invoke(myClass);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
