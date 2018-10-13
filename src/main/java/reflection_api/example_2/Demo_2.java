package reflection_api.example_2;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

//Определение интерфейсов и конструкторов класса
public class Demo_2 {
    public static void main(String[] args) {
        /*
        Для получения в режиме run-time списка интерфейсов реализованных классом ,
        необходимо получить Class и использовать его метод getInterfaces().
         */
        Class<?> clazz = ArrayList.class;
        Class<?>[] interfaces = clazz.getInterfaces();

        System.out.println("List of interfaces\n");
        for(Class<?> ifc : interfaces) {
            System.out.println (ifc.getName());
        }

        /*
        Метод класса getConstructors() позволяет получить массив
        открытых конструкторов типа java.lang.reflect.Constructor.
        После этого, можно извлекать информацию о типах параметров
        конструктора и генерируемых исключениях
         */
        ArrayList<?> obj = new ArrayList<>();
        Class<?> clazz_1 = obj.getClass();
        Constructor[] constructors = clazz_1.getConstructors();

        System.out.println("List of constructors\n");
        for (Constructor constructor : constructors) {
            Class<?>[] params = constructor.getParameterTypes();
            for (Class<?> param : params) {
                System.out.println(param.getName());
            }
        }
    }
}
