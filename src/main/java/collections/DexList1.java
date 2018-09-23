package collections;

import java.util.*;

public class DexList1 {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("element 0");
        listA.add("element 1");
        listA.add("element 2");
        int size = listA.size();

//access via index
        String element0 = listA.get(0);
        String element1 = listA.get(1);
        String element3 = listA.get(2);

//print all elements
        Iterator iterator = listA.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//foreach-loop
        for (Object object : listA) {
            String element = (String) object;
            System.out.println(element);
        }

//classic for loop
        for (int i = 0; i < listA.size(); i++) {
            System.out.println(listA.get(i));
        }

        ArrayList<Integer> listB = new ArrayList<>();
        listB.addAll(Arrays.asList(100, 200, 300));

//sorting
        Collections.sort(listB, (o1, o2) -> o2.compareTo(o1));//descending order
        Collections.sort(listB);//ascending order

//filtering
        //remove all numbers more than 200
        listB.removeIf(i -> i > 200);
        System.out.println(listB);
        listB.stream().filter(i -> i <= 200);
        System.out.println(listB);
    }
}
