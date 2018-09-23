package collections;

import java.util.*;

/**
 * d – number of records in the list of known word.
 * Next go d lines contain one known word per line,
 * next — the number l of lines of the text,
 * after which — l lines of the text.
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
public class ExTreeMap4 {

    public static void main(String[] args) {
        SortedSet<String> dict = new TreeSet<>();
        Set<String> worlds = new LinkedHashSet<>();
        Integer count1 = 0;
        Integer count2 = 0;
        Scanner reader = new Scanner(System.in);
        try {
            count1 = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < count1; i++) {
                dict.add(reader.nextLine().toLowerCase());
            }
            count2 = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < count2; i++) {
                List<String> list = new ArrayList<>(Arrays.asList(reader.nextLine().toLowerCase().split(" ")));
                for (String world: list) {
                    if (!dict.contains(world)) {
                        worlds.add(world);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }

        for(String world: worlds) {
            System.out.println(world);
        }
    }
}
