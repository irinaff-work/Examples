package collections;

import java.util.*;

public class ExCollections2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        Scanner reader = new Scanner(System.in);
        try {
            list = Arrays.asList(reader.nextLine().toLowerCase().split(" "));

            int count = reader.nextInt();
            int index1;
            int index2;
            String el1;
            String el2;
            for (int i = 0; i < count; i++) {
                index1 = reader.nextInt();
                index2 = reader.nextInt();
                el1 = list.get(index1);
                el2 = list.get(index2);
                list.set(index1, String.valueOf(el2));
                list.set(index2, String.valueOf(el1));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
