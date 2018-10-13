package reflection_api.example_2;

import java.lang.reflect.Modifier;

//Определение свойств класса
public class Demo_1 {
    public static void main(String[] args) {
        /*
        В работающем приложении для получения класса необходимо
        использовать метод forName (String className).
        Следующий код демонстрирует возможность создания класса
        без использования и с использованием Reflection
         */
        // Без использования Reflection
        Foo foo = new Foo();

        try {
            // С использованием Reflection
            //Class clazz = Class.forName("Foo");
            Class clazz = Class.forName(Foo.class.getName());
            System.out.println(clazz);

            // Загрузка JDBC-драйвера
            //Метод класса forName(className) часто используется для загрузки JDBC-драйвера.
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //Методом getName() объекта Class можно получить наименование класса, включающего пакет (package)
        Class clazz = foo.getClass();
        System.out.println (clazz.getName());

        //Для получения значения модификатора класса используется метод getModifiers().
        //Класс java.lang.reflect.Modifier содержит статические методы,
        //возвращающие логическое значения проверки модификатора класса
       // Class cls = foo.getClass();
        int mods = clazz.getModifiers();
        if (Modifier.isPublic  (mods))	{ System.out.println("public");  }
        if (Modifier.isAbstract(mods))	{ System.out.println("abstract");}
        if (Modifier.isFinal   (mods))	{ System.out.println("final");   }

        //Для получения суперкласса рефлексированного объекта (класса)
        //необходимо использовать метод getSuperclass() :
        System.out.println (clazz.getSuperclass());
        /*
        для получения всех предков следует рекурсивно вызвать метод getSuperclass()
        в цикле, пока не будет достигнут Object, являющийся родителем всех классов.
        Object не имеет родителей, поэтому вызов его метода getSuperclass() вернет null.
         */
    }
}
