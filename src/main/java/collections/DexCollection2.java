package collections;

import java.util.*;

public class DexCollection2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1);
        Integer sum = 0;

//foreach loop
        for (Integer item : list) {
            sum += item;
        }

//using iterator,for example, for remove elements from collection. Its good idea..
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int item = iterator.next();
            if (item > 10) iterator.remove();//this action to delete an item directly from the list
        }

        //in JDK8 you can do the following
        list.forEach(i -> System.out.print(i + " "));//we can say that this is the same foreach-loop

//the result of the execution of this code:
//10 1
        Spliterator<Integer> spliterator = list.spliterator();
        spliterator.forEachRemaining(integer -> {
            if (integer%2==0) System.out.println("even the number");
        });//using lambda expressions it becomes very convenient

//trySplit() example;
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2));

        Spliterator<Integer> split = lst.spliterator();
        split.trySplit().forEachRemaining(System.out::println);//-> 1 1 1
        System.out.println("---------");
        split.forEachRemaining(System.out::println);//2 2 2 2
    }
}
