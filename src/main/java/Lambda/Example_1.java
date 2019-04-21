package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Example_1 {
    public static void main(String[] args) {
        System.out.println("=== RunnableTest ===");
        // Anonymous Runnable
        Runnable r1 = new Runnable(){
            @Override
            public void run(){
                System.out.println("Hello world one!");
            }
        };
        // Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");

        // Run em!
        r1.run();
        r2.run();

        //Поток Thread можно проинициализировать двумя способами:
        // Старый способ:
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread old");
            }
        }).start();
        // Новый способ:

        new Thread(
                () -> System.out.println("Hello from thread example_1!")
        ).start();

        Consumer c = (x) -> { x = '1'; System.out.println(x); };

        BiConsumer b = ( x, y) -> {x = '1'; y = '1'; System.out.println(x + " : " + y);};

        Predicate p = (s) -> { s = '1'; return true;};

        // Старый способ вывода всех элементов заданного массива:
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list1) {
            System.out.println(n);
        }
        // Новый способ:
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list2.forEach(n -> System.out.println(n));
        // Новый способ с использованием оператора двойного двоеточия ::
        list2.forEach(System.out::println);




    }
}
