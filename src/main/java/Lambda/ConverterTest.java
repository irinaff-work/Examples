package Lambda;

//https://habr.com/ru/post/216431/
public class ConverterTest {

    public static void main(String[] args) {
        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
        Integer converted = converter.convert("123");
        System.out.println(converted);

        //передача ссылки на статический метод
        Converter<String, Integer> converter1 = Integer::valueOf;
        Integer converted1 = converter1.convert("123");
        System.out.println(converted1);

        //передача ссылки на экземплярный метод
        Something something = new Something();
        Converter<String, String> converter2 = something::startsWith;
        String converted2 = converter2.convert("Java");
        System.out.println(converted2);

        //передача ссылки на конструктор
        //вместо реализации интерфейса мы соединяем все вместе при помощи ссылки на конструктор
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

        //Доступ к переменным внешней области действия из лямбда-выражения
        int num = 1;
        Converter<Integer, String> stringConverter = (from) -> String.valueOf(from + num);
        System.out.println(stringConverter.convert(2));
        //в отличии от анонимных объектов, переменная num не обязательно должна быть объявлена как final.
        //Однако переменная num должна все равно оставаться неизменяемой. Следующий код не скомпилируется
        //num = 3;
    }
}
