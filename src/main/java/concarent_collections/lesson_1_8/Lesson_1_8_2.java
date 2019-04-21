package concarent_collections.lesson_1_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @autor irinaff
 * @since 29.03.2019
 * Comparable & Comparator
 **/

public class Lesson_1_8_2 {
    public static void main(String[] args) {
        //Comparable & Comparator
        //пример сортировки
        List<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1,1,1,6,3,7,9,2,2,2,2,6,8,12,14,18));

        //in ascending order
        lst.sort((o1, o2) -> o1.compareTo(o2));
        lst.sort(Integer::compareTo);
        Collections.sort(lst, Comparator.naturalOrder());
        Collections.sort(lst);

        lst.forEach(System.out::print);

        //with Stream API
        lst.stream()
                .filter(i -> i%2 == 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
