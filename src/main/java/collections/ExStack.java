package collections;

import java.util.Stack;

public class ExStack {

    public static void main(String[] args) {
        //Но иногда используется класс Stack <E> с более минимальным API.
        // Он не реализует интерфейс Deque или Queue.
        //Метод pop () всегда выдает исключение, если стек пуст.
        //Согласно Java Doc, предпочтительнее использовать
        // реализации интерфейса Deque в виде стеков.

        Stack<String> stack = new Stack<>();

        stack.push("first");
        stack.push("second");
        stack.push("third");

        System.out.println(stack); // [first, second, third]

        System.out.println(stack.pop()); // "third"
        System.out.println(stack.pop()); // "second"
        System.out.println(stack.pop()); // "first"

        //System.out.println(stack.pop()); // throws EmptyStackException
    }
}
