package concarent_collections.lesson_1_7.collector_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 29.03.2019
 **/

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Andrew", 20),
                new Person("Igor", 23),
                new Person("Vitia", 12));

        //return the list of names of all the persons
        List<String> names = persons.stream().map(p-> p.name).collect(Collectors.toList());

        //obtain other collections using Collectors.toSet(), Collectors.toMap()
        Map<String, String> map = Stream.of("AA", "BB", "CC")
                .collect(Collectors.toMap(k->k, v->v+v));
        map.forEach((k,v)->System.out.println("key: " + k + " value: "+v));

        //Сollectors.toCollection() creates a collection you want to use
        List<Integer> ages = persons.stream().map(p -> p.age)
                .collect(Collectors.toCollection(ArrayList::new));
        ages.forEach(System.out::println);

        //Этот код рассчитывает сумму возрастов всех лиц старше 18 лет
        //first way
        Integer agesSumOfPersonsOlderThan18 = persons.stream().filter(p -> p.age > 18)
                .collect(Collectors.summingInt(p -> p.age));
        System.out.println(agesSumOfPersonsOlderThan18);
        //second
        Integer agesSumOfPersonsOlderThan18_v2 = persons.stream().filter(p -> p.age > 18)
                .mapToInt(p -> p.age).sum();
        System.out.println(agesSumOfPersonsOlderThan18_v2);

        //Collectors.joining объединяет элементы потока для заданного разделителя, префикса и суффикса
        List<String> list = Arrays.asList("A", "b", "C", "D");
        String result = list. stream().collect(Collectors.joining(",", "list:", "!"));
        System.out.println(result);
    }
}
