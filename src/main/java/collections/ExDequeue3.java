package collections;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;

public class ExDequeue3 {

    public static void main(String[] args) {
//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.offer(2);
//        queue.offer(0);
//        queue.offer(1);
//        queue.offer(7);
//
//        System.out.println(queue);

//        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
//
//        queue.offerLast(5);
//        queue.pollFirst();
//        queue.pollFirst();
//        System.out.println(queue);

        Deque<String> states = new ArrayDeque<String>();

        states.add("Germany");
        states.add("France");
        states.push("UK");
        states.offerLast("Norway");

        String sFirst = states.pop();
        String s = states.peek();
        String sLast = states.peekLast();
        states.offer(sFirst);
        String s1 = states.pollLast();

        while (states.peek() != null) {
            System.out.print(states.pop());
        }
    }
}
