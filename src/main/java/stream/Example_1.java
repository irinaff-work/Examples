package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Example_1 {

    public static void main(String[] args) {
        //как работать с потоком последовательно
        //создадим источник в виде списка строк:
        List<String> stringCollection = new ArrayList<>();
        stringCollection.add("ddd2");
        stringCollection.add("aaa2");
        stringCollection.add("bbb1");
        stringCollection.add("aaa1");
        stringCollection.add("bbb3");
        stringCollection.add("ccc");
        stringCollection.add("bbb2");
        stringCollection.add("ddd1");

        //Операция Filter принимает предикат, который фильтрует все элементы потока.
        // Эта операция является промежуточной,
        // т.е. позволяет нам вызвать другую операцию (например, forEach) над результатом
        stringCollection
                .stream()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        // "aaa2", "aaa1"

        //Операция Sorted является промежуточной операцией, которая возвращает
        // отсортированное представление потока.
        // Элементы сортируются в обычном порядке, если вы не предоставили свой компаратор:
        stringCollection
                .stream()
                .sorted()
                .filter((s) -> s.startsWith("a"))
                .forEach(System.out::println);
        // "aaa1", "aaa2"

        /*
        sorted создает всего лишь отсортированное представление
        и не влияет на порядок элементов в исходной коллекции.
        Порядок строк в stringCollection остается нетронутым:
         */
        System.out.println(stringCollection);
        //// ddd2, aaa2, bbb1, aaa1, bbb3, ccc, bbb2, ddd1

        /*
        Промежуточная операция map преобразовывает каждый элемент
        в другой объект при помощи переданной функции.
        Следующий пример преобразовывает каждую строку
        в строку в верхнем регистре.
        Однако вы так же можете использовать map для преобразования каждого
        объекта в объект другого типа.
        Тип результирующего потока зависит от типа функции,
        которую вы передаете при вызове map.
         */
        stringCollection
                .stream()
                .map(String::toUpperCase)
                .sorted((a, b) -> b.compareTo(a))
                .forEach(System.out::println);

        // "DDD2", "DDD1", "CCC", "BBB3", "BBB2", "AAA2", "AAA1"

        /*
        match
        Для проверки, удовлетворяет ли поток заданному предикату,
        используются различные операции сопоставления (match).
        Все операции сопоставления являются конечными и возвращают результат типа boolean.
         */
        boolean anyStartsWithA =
                stringCollection
                        .stream()
                        .anyMatch((s) -> s.startsWith("a"));
        System.out.println(anyStartsWithA);      // true

        boolean allStartsWithA =
                stringCollection
                        .stream()
                        .allMatch((s) -> s.startsWith("a"));
        System.out.println(allStartsWithA);      // false

        boolean noneStartsWithZ =
                stringCollection
                        .stream()
                        .noneMatch((s) -> s.startsWith("z"));
        System.out.println(noneStartsWithZ);      // true

        /*
        Операция Count является конечной операцией и возвращает количество элементов в потоке.
        Типом возвращаемого значения является long.
         */
        long startsWithB =
                stringCollection
                        .stream()
                        .filter((s) -> s.startsWith("b"))
                        .count();
        System.out.println(startsWithB);    // 3

        /*
        Reduce
        Эта конечная операция производит свертку элементов потока по заданной функции.
        Результатом является опциональное значение.
         */
        Optional<String> reduced =
                stringCollection
                        .stream()
                        .sorted()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
        // "aaa1#aaa2#bbb1#bbb2#bbb3#ccc#ddd1#ddd2"
    }
}
