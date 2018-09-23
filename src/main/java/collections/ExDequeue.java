package collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class ExDequeue {

    public static void main(String[] args) {
        //В качестве очереди (FIFO) можно использовать реализации интерфейса Deque.

        Queue<String> q = new ArrayDeque<>();

        q.add("first");
        q.add("second");
        q.add("third");

        System.out.println(q.peek()); // "first", it doesn't remove the element
        System.out.println(q.peek()); // "first"
        System.out.println(q.remove()); // "first", it removes and returns the head element

        System.out.println(q.peek()); // "second"
        System.out.println(q.remove()); // "second"

        System.out.println(q.remove()); // "third"

        System.out.println(q.isEmpty()); // "true"
    }
}
