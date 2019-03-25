package concarent_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 19.03.2019
 * Queue + Deque
 **/

public class Lesson_1_4 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        Queue<String> queue1 = new PriorityQueue<>();
        queue1.offer("a");
        queue1.offer("b");
        queue1.offer("c");
        queue1.offer("a11");
        queue1.offer("a8");

        String s1 = queue1.poll();//return element from head of queue and remove ﻿it
        String s2 = queue1.peek();//only return element from head of queue
        queue1.forEach(System.out::println);

        Deque dequeA = new LinkedList();
        dequeA.add("element 1");
        dequeA.addFirst("element 2");
        dequeA.addLast("element 3");
        dequeA.forEach(System.out::println);

        Object element = dequeA.element();
        Object firstElement = dequeA.getFirst();
        Object lastElement = dequeA.getLast();

        System.out.println(element);
        System.out.println(firstElement);
        System.out.println(lastElement);
    }
}
