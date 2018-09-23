package collections;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExExTreeSet3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\\s+");
        SortedSet<String> sortedSet = new TreeSet<>();
        try {
            int quantity = reader.nextInt();
            reader.nextLine();
            for (int i = 0; i < quantity; i++) {
                sortedSet.add(reader.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }

        System.out.println("sortedSet:"+ sortedSet);
        for (String world: sortedSet) {
            System.out.println(world);
        }

    }
}
