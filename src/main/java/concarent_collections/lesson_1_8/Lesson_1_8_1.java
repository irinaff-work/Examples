package concarent_collections.lesson_1_8;

import javax.print.DocFlavor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 *
 * @autor irinaff
 * @since 29.03.2019
 * Как превратить строку в коллекцию?
 **/

public class Lesson_1_8_1 {
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
    }
}
