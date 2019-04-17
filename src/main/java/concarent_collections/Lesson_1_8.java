package concarent_collections;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 29.03.2019
 * Как превратить строку в коллекцию?
 * Comparable & Comparator
 **/

public class Lesson_1_8 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = reader.readLine();
            List<Integer> list = new ArrayList<>();
            List<Integer> arrayList = Arrays.stream(s.split("\\s")).mapToInt(Integer::valueOf).boxed()
                    .collect(Collectors.toList());

            String[] arr = s.split(" ");
            for (String s1 : arr) {
                list.add(Integer.parseInt(s1) + 1000);
            }

            System.out.println("arrayList");
            arrayList.forEach(i -> System.out.print(i + " "));
            System.out.println("list");
            list.forEach(i -> System.out.print(i + " "));
            System.out.println("arr");
            Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

        } catch (IOException e) {
            System.out.println("!");
        }

        //Comparable & Comparator
        //пример сортировки
        List<Integer> lst = new ArrayList<>();
        lst.addAll(Arrays.asList(1,1,1,6,3,7,9,2,2,2,2));

        //in ascending order
        lst.sort((o1, o2) -> o1.compareTo(o2));
        lst.sort(Integer::compareTo);
        Collections.sort(lst, Comparator.naturalOrder());
        Collections.sort(lst);

        lst.forEach(System.out::print);

        System.out.println("[" + (char) 32 + "]");

    }
}
