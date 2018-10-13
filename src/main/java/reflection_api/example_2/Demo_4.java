package reflection_api.example_2;

import java.lang.reflect.Method;

//Определение методов класса
public class Demo_4 {
    public static void main(String[] args) {
        /*
        Метод getMethods() объекта Class возвращает массив открытых методов
        типа java.lang.reflect.Method. Эти методы могут быть определены
        не только в классе, но также и в его родителях (суперклассе),
        либо интерфейсах, реализованных классом или его родителями.
        Класс Method позволяет получить имя метода, тип возвращаемого им значения,
        типы параметров метода, модификаторы и генерируемые исключения.
         */
        Foo obj = new Foo();
        Class<?> cls = obj.getClass();
        Method[] methods = cls.getMethods();

        for (Method method : methods) {
            System.out.println("Method name : " + method.getName());
            System.out.println("Return type : " +
                    method.getReturnType().getName());

            Class<?>[] params = method.getParameterTypes();
            System.out.print("Parameters : ");
            for (Class<?> paramType : params) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        //Если известно имя метода и типы его параметров, то можно получить отдельный метод класса
        Class[] params = new Class[] {Integer.class, String.class};
        try {
            Method method = cls.getMethod("metod2", params);
            System.out.println("method=" + method);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
