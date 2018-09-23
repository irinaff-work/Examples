package collections;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ExTreeMap3_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> words = new TreeMap<>();
        String word;
        while (scanner.hasNext()) {
            word = scanner.next().toLowerCase(Locale.getDefault());
            words.put(word, words.getOrDefault(word, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : words.entrySet()) System.out.println(entry.getKey() + " " + entry.getValue());
    }
}
