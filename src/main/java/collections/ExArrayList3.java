package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExArrayList3 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list.indexOf(3) =" +
                list1.indexOf(3));

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(1);
        list3.add(2);

        if (list1.equals(list1)) {
            System.out.println("list1.equals(list1)");
        }

        if (list1.equals(list3)) {
            System.out.println("list1.equals(list3)");
        }

        if (list1.equals(list2)) {
            System.out.println("list1.equals(list2)");
        }

        if (list3.equals(list2)) {
            System.out.println("list3.equals(list2)");
        }
    }
}
