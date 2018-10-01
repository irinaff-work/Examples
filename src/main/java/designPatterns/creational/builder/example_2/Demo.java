package designPatterns.creational.builder.example_2;

/**
 * Класс GoodClass является неизменным и все
 * значения параметров по умолчанию находятся в одном месте.
 * Сеттеры возвращают класс-строитель, поэтому
 * вызовы можно объявлять в цепочку.
 */
public class Demo {
    public static void main(String[] args) {
        GoodClass goodClass = new GoodClass.Builder(40, 20)
                .optFieldOne(2)
                .optFieldTwo(4)
                .optFieldThird(23)
                .optFieldFour(9)
                .buidl();
    }
}
