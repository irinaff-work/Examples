package reflection_api.example_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//Как же вызывать методы с аргументами и конструкторы с параметрами?
public class Demo_3 {
    public static void main(String[] args) {
        MyClass_2 myClass = null;

        try {
            Class clazz = Class.forName(MyClass_2.class.getName());
            Class[] params = {int.class, String.class};
            myClass = (MyClass_2) clazz.getConstructor(params).newInstance(1, "default2");
        } catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | NoSuchMethodException |
                InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);//output created object reflection.MyClass@60e53b93

        //Для получения конструкторов класса следует у описания
        // класса вызвать метод getConstructors()

        // Для получения параметров конструктора класса следует
        //у конструктора класса вызвать метод getParameterTypes():
        try {
            Class clazz = Class.forName(MyClass_2.class.getName());
            Constructor[] constructors = clazz.getConstructors();

            for (Constructor constructor : constructors) {
                Class[] paramTypes = constructor.getParameterTypes();
                for (Class paramType : paramTypes) {
                    System.out.print(paramType.getName() + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
