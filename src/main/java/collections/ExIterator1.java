package collections;

import java.util.*;

public class ExIterator1 {
    public static void main(String[] args) {
        Set<Long> set = new TreeSet<>(); // sorted set
        set.add(10L);
        set.add(5L);
        set.add(18L);
        set.add(14L);
        set.add(9L);

        System.out.println(set); // [5, 9, 10, 14, 18]

        Iterator<Long> iter = set.iterator();
        while (iter.hasNext()) {
            Long current = iter.next();
            if (current < 10) {
                iter.remove();
            }
        }
        System.out.println(set); // [10, 14, 18]

        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(22);
        list.add(13);
        list.add(10);
        list.add(22);
        list.add(13);

        ListIterator<Integer> listIterator = list.listIterator(); // only for lists!

        System.out.println(listIterator);

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous() +" on "+ listIterator.previousIndex());
        }

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.next() +" on "+ listIterator.nextIndex());
        }
    }
}
