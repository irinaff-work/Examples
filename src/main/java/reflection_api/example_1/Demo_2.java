package reflection_api.example_1;

public class Demo_2 {
    public static void main(String[] args) {
        //Создадим экземпляр класса с помощью рефлексии
        MyClass myClass = null;
        /*
        На момент старта java приложения далеко не все классы оказываются
        загруженными в JVM. Если в вашем коде нет обращения к классу MyClass,
        то тот, кто отвечает за загрузку классов в JVM, а им является
        ClassLoader, никогда его туда и не загрузит. Поэтому нужно
        заставить ClassLoader загрузить его и получить описание нашего
        класса в виде переменной типа Class. Для этой задачи существует метод
        forName(String), где String -  имя класса, описание которого нам требуется.
        способ будет работать только с конструктором по умолчанию (без параметров)
         */
        try {
            Class clazz = Class.forName(MyClass.class.getName());
            myClass = (MyClass) clazz.newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(myClass);//output created object reflection.MyClass@60e53b93
    }
}
