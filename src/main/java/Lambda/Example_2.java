package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Example_2 {

    public static void main(String [] a)  {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("Выводит все числа: ");
        evaluate(list, (n)->true);

        System.out.print("Не выводит ни одного числа: ");
        evaluate(list, (n)->false);

        System.out.print("Вывод четных чисел: ");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.print("Вывод нечетных чисел: ");
        evaluate(list, (n)-> n%2 == 1 );

        System.out.print("Вывод чисел больше 5: ");
        evaluate(list, (n)-> n > 5 );

        //вывести квадрат каждого элемента
        // Старый способ:
        System.out.print("вывести квадрат каждого элемента (старый способ): ");
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        for (Integer n : list) {
            int x = n * n;
            System.out.println(x);
        }
        // Новый способ:
        System.out.print("вывести квадрат каждого элемента (новый способ): ");
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        list.stream().map((x) -> x*x).forEach(System.out::println);

        //вывести сумму квадратов всех элемента списка
        // Старый способ:
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.print("вывести сумму квадратов всех элемента списка (старый способ): ");
        int sum = 0;
        for(Integer n : list) {
            int x = n * n;
            sum = sum + x;
        }
        System.out.println(sum);
        // Новый способ:
        //List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.print("вывести сумму квадратов всех элемента списка (новый способ): ");
        int sum1 = list.stream().map(x -> x*x).reduce((x,y) -> x + y).get();
        System.out.println(sum1);


    }

    public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n: list)  {
            if (predicate.test(n)) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
