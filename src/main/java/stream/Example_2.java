package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Example_2 {
    /*
    потоки могут быть последовательными и параллельными.
    Операции над последовательными потоками выполняются в одном потоке процессора,
    над параллельными — используя несколько потоков процессора.
    пример демонстрирует, как можно легко увеличить скорость работы, используя параллельные потоки.
     */
    public static void main(String[] args) {
        //создадим большой список из уникальных элементов
        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }

        //измерим время сортировки этого списка
        //оба куска кода практически идентичны, однако параллельная сортировка почти в два раза быстрее.
        // Все, что вам нужно сделать, это заменить вызов stream() на parallelStream().
        //Последовательная сортировка
        long t10 = System.nanoTime();

        long count1 = values.stream().sorted().count();
        System.out.println(count1);

        long t11 = System.nanoTime();

        long millis1 = TimeUnit.NANOSECONDS.toMillis(t11 - t10);
        System.out.println(String.format("sequential sort took: %d ms", millis1));
        // sequential sort took: 899 ms

        //Параллельная сортировка
        long t20 = System.nanoTime();

        long count2 = values.parallelStream().sorted().count();
        System.out.println(count2);

        long t21 = System.nanoTime();

        long millis2 = TimeUnit.NANOSECONDS.toMillis(t21 - t20);
        System.out.println(String.format("parallel sort took: %d ms", millis2));
        // parallel sort took: 472 ms
    }
}
