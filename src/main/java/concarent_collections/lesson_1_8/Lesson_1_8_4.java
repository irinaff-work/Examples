package concarent_collections.lesson_1_8;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @autor irinaff
 * @since 16.04.2019
 * Filter and replace
 **/

public class Lesson_1_8_4 {
    public static void main(String[] args) {
        //У нас есть 3 способа фильтрации
        //предположим, что наша задача - убрать все числа от 5 до 7 включительно
        //1 и 2 изменяют фактическую коллекцию, 3 - мы фильтруем поток, полученный из коллекции
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,3,5,7,8,9,10));

        //1.old school method
        Iterator<Integer> iterator = nums.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a >= 5 && a <= 7) {
                iterator.remove();
            }
        }
        nums.stream().forEach(System.out::println);

        //2.use new method with lambda expr
        nums.clear();
        nums.addAll(Arrays.asList(1,3,5,7,8,9,10));
        nums.removeIf(a -> a >=5 && a <= 7);
        nums.stream().forEach(System.out::println);

        //3.using Stream API
        nums.clear();
        nums.addAll(Arrays.asList(1,3,5,7,8,9,10));
        nums = nums.stream().filter(n -> (n > 0 && n < 5) || (n > 7))
                .collect(Collectors.toList());
        nums.stream().forEach(System.out::println);

        //Замена
        //Например, нам нужно возвести в квадрат каждый элемент ([0,1,2,3] -> [0,1,4,9])
        //new method of replacing
        nums.replaceAll(n -> n*n);
        nums.stream().forEach(System.out::println);

        //replace all strings starts with "a" to "str"
        List<String> strs = new ArrayList<>(Arrays.asList("as", "sa", "da"));
        strs.replaceAll(a -> {
            if (a.startsWith("a")) return "srt";
            else return a;
        });
        strs.stream().forEach(System.out::println);

        // using Stream API(it made at least some sense to add more operations)
        nums.stream().map(n -> n*n).filter(n -> n > 10 ).forEach(System.out::println);
    }
}
