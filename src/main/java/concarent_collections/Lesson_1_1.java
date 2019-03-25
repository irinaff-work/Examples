package concarent_collections;

import java.util.*;

public class Lesson_1_1 {

    public static void main(String[] args) {
        //в этом случае набор может хранить что угодно
        Collection set = new HashSet();
        set.add(1000);
        set.add("Hello");
        set.add(new Object());

        //мы можем отсортировать
        //Collections.sort(set,(o1, o2)->o2.compareTo(o1));//descending order(5 4 3 2 1)

        //мы можем использовать Wildcard:
        Collection<? super Number> c = new ArrayList<>();
        c.add(100);
        c.add(100.9999);
        //c.add("d"); //error!!!

        //распространенная ошибка:
        //если мы создадим
        //мы ничего не можем добавить в коллекцию!
        Collection<?> collection = new HashSet();
        //collection.add(new Object()); //error!
        //collection.add(0); //error!

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        list.add(1);
        Integer sum = 0;

        //foreach loop
        for(Integer item : list) {
            sum += item;
        }

        //using iterator,for example, for remove elements from collection. Its good idea..
        Iterator<Integer> iter = list.iterator();
        while(iter.hasNext()) {
        int item = iter.next();
        if(item > 10) iter.remove(); //this action to delete an item directly from the list
        }

        //in JDK8 you can do the following
        list.forEach(i -> System.out.print(i+" "));//we can say that this is the same foreach-loop

        //the result of the execution of this code:
        //10 1

        Spliterator<Integer> spliterator = list.spliterator();
        //using lambda_1 expressions it becomes very convenient
        spliterator.forEachRemaining(integer -> {if (integer%2==0) System.out.println("even the number"); });

        //trySplit() example;
        List<Integer> lst = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2));

        Spliterator<Integer> split = lst.spliterator();
        split.trySplit().forEachRemaining(System.out::println);
        System.out.println("---------");
        split.forEachRemaining(System.out::println);

        //only for lists!
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next() + " on " + listIterator.nextIndex());
        }
    }
}
