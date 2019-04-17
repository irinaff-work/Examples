package concarent_collections;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 23.03.2019
 * Lambda Expressions
 * FunctionalInterface - interface with one abstract method
 **/

public class Lesson_1_6 {
    public static void main(String[] args) {
        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        //Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");
        //if the lambda_1 expression is not one string use {//method body}:
        Runnable r3 =() -> {
            System.out.println("Hello world two!");
            System.out.println("I'm better than r1");
        };

        //Stream
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        //Stream предоставил новый метод forEach для итерации каждого элемента потока
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //Метод map используется для отображения каждого элемента на соответствующий результат
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

        //Метод «фильтр» используется для исключения элементов на основе критериев
        List<String> strings1 = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        long count = strings1.stream().filter(string -> string.isEmpty()).count();

        //The ‘sorted’ method is used to sort the stream
        Random random1 = new Random();
        //random1.ints().limit(10).sorted((o1,o2)-> o2.compareTo(o1)).forEach(System.out::println);

        int max = 1000000;
        List<String> values = new ArrayList<>(max);
        for (int i = 0; i < max; i++) {
            UUID uuid = UUID.randomUUID();
            values.add(uuid.toString());
        }
        //parallel
        long t0 = System.nanoTime();
        long count2 = values.parallelStream().sorted().count();
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1-t0);
        System.out.println(String.format("parallel sort took: %d ms",millis));
    }
}
