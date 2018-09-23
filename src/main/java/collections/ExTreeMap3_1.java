package collections;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExTreeMap3_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Map<String, Long> words =
                Arrays.stream(s.split(" "))
                        .map(String::toLowerCase)
                        .collect(Collectors.groupingBy(
                                Function.identity(), Collectors.counting()));
        for(Map.Entry<String, Long> es : words.entrySet()) {
            System.out.println(es.getKey() + " " + es.getValue().toString());
        }
    }
}
