package collections;

import java.util.*;

public class ExTreeMap5 {
    public static void main(String[] args) {
        Map<String, String> dict1 = new HashMap<>();
        Map<String, String> dict2 = new HashMap<>();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        Scanner reader = new Scanner(System.in);
        try {
            list1 = new ArrayList<>(Arrays.asList(reader.nextLine().toLowerCase().split("")));
            list2 = new ArrayList<>(Arrays.asList(reader.nextLine().toLowerCase().split("")));
            for (int i = 0; i < list1.size(); i++) {
                dict1.put(list1.get(i), list2.get(i));
                dict2.put(list2.get(i), list1.get(i));
            }

            list1.clear();
            list2.clear();

            list1 = Arrays.asList(reader.nextLine().toLowerCase().split(""));
            list2 = Arrays.asList(reader.nextLine().toLowerCase().split(""));



        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }

        for (int i = 0; i < list1.size(); i++) {
            System.out.print(dict1.get(list1.get(i)));
        }
        System.out.println();

        for (int i = 0; i < list2.size(); i++) {
            System.out.print(dict2.get(list2.get(i)));
        }
        System.out.println();
    }
}
