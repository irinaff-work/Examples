package Lambda;

//https://habr.com/ru/post/216431/
public class Lambda4 {

    //В отличии от локальных переменных, мы можем записывать значения в экземплярные поля класса
    // и статические переменные внутри лямбда-выражений.
    // Это поведение хорошо знакомо по анонимным объектам.
    static int outerStaticNum;
    int outerNum;

    void testScopes() {
        Converter<Integer, String> stringConverter1 = (from) -> {
            outerNum = 23;
            return String.valueOf(from);
        };

        Converter<Integer, String> stringConverter2 = (from) -> {
            outerStaticNum = 72;
            return String.valueOf(from);
        };
    }
}
