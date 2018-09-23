package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDequeue2 {

    public static void main(String[] args) {

        //Кроме того, можно использовать любую реализацию интерфейса Deque как стек (LIFO).

        Deque<String> stack = new ArrayDeque<>();

        stack.offerLast("first");
        stack.offerLast("second");
        stack.offerLast("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pollLast()); // "third"
        System.out.println(stack.pollLast()); // "second"
        System.out.println(stack.pollLast()); // "first"

        System.out.println(stack.pollLast()); // null
    }
}
