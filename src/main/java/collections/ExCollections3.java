package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExCollections3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Collections.unmodifiableCollection(numbers);
        //Collections.frequency(list, 10);
        Collections.replaceAll(numbers, 4, 5);
        //Collections.sort(list);
        Collections.addAll(numbers, 2, 3);
        //Collections.min(list);
    }
}
