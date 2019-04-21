package concarent_collections.lesson_1_8;

import java.util.*;

/**
 * @autor irinaff
 * @since 16.04.2019
 * Comparable & Comparator
 **/

public class Lesson_1_8_3 {
    public static void main(String[] args) {
        List<Pet> petList = new ArrayList<>();
        petList.add(new Pet(10, "Red"));
        petList.add(new Pet(1, "Cezar"));

        Collections.sort(petList, (p1, p2) -> p1.getAge().compareTo(p2.getAge()));
        //or
        Collections.sort(petList, Comparator.comparing(p -> (p.getAge())));
        //Stream API
        //compares alphabetically
        petList.stream().sorted((p1, p2) -> (p2.getName()
                .compareTo(p1.getName())))
                .forEach(System.out::println);

        //or compareToIgnoreCase()
        petList.stream().sorted((p1, p2) -> (p2.getName()
                .compareToIgnoreCase(p1.getName())))
                .forEach(System.out::println);
    }
}
