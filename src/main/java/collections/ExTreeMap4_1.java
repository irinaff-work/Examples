package collections;

import java.util.*;
//Илья Соловьёв

/**
 * Sample Input:

 3
 a
 bb
 cCc
 2
 a bb aab aba ccc
 c bb aaa
 Sample Output:

 aaa
 aab
 c
 aba
 */


public class ExTreeMap4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dictionarySize = scanner.nextInt();
        Set<String> dictionary = new HashSet<>();
        for (int i = 0; i < dictionarySize; i++) dictionary.add(scanner.next().toLowerCase(Locale.getDefault()));
        scanner.next();
        String word;
        Set<String> errors = new TreeSet<>();
        while (scanner.hasNext()) {
            word = scanner.next();
            if (!dictionary.contains(word.toLowerCase(Locale.getDefault()))) errors.add(word);
        }
        for (String error : errors) System.out.println(error);
    }
}
