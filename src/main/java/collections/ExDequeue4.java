package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class ExDequeue4 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int exit = 0;
            Deque<String> queue = new ArrayDeque<>();
            Integer quantity = Integer.valueOf(reader.nextLine());

            while (exit < quantity) {
                try {
                    queue.push(reader.nextLine());
                    exit++;
                } catch (Exception e) {
                    System.out.println("Illegal symbol");
                }
            }
            while (queue.peek() != null) {
                System.out.println(queue.pop());
            }
        } finally {
            reader.close();
        }
    }
}
