package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExCollections1 {
    public static void main(String[] args) {
        //Let's assume we have the collection list containing elements [1, 2, 3, 2, 3, 4].
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 3, 4));

        int countInList = Collections.frequency(list, 3); // the count is 2
        System.out.println("countInList=" + countInList);

        Collections.sort(list); // [1, 2, 3, 2, 3, 4] -> [1, 2, 2, 3, 3, 4]
        System.out.println("sort: " + list);

        Collections.reverse(list); // [4, 3, 3, 2, 2, 1]
        System.out.println("reverse: " + list);

        Collections.addAll(list, 5, 6, 7); // the list is [4, 3, 3, 2, 2, 1, 5, 6, 7]
        System.out.println("addAll: " + list);

        int max = Collections.max(list); // the max is 7
        System.out.println("max=" + max);

        // It's impossible to change the unmodifiable list
        List<Integer> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println("unmodifiableList: " + unmodifiableList);

        Collections.shuffle(unmodifiableList); // it throws UnsupportedOperationException
        //Methods for creating empty and singleton collections also returns unmodifiable collections.
        System.out.println("shuffle: " + unmodifiableList);

        //Here is an interesting example:

        List<Integer> singletonList = Collections.singletonList(10);
        System.out.println("singletonList: " + singletonList);

        Collections.sort(singletonList); // it doesn't throw an exception
        System.out.println("sort: " + singletonList);

        Collections.shuffle(singletonList); // it doesn't throw an exception
        System.out.println("shuffle: " + singletonList);

        Collections.addAll(singletonList, 1, 2); // it throws the UnsupportedOperationException
        System.out.println("addAll: " + singletonList);
    }
}
