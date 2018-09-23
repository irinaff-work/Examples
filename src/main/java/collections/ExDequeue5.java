package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ExDequeue5 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int exit = 0;
            Deque<String> queue = new ArrayDeque<>();
            Integer quantity = Integer.valueOf(reader.nextLine());

            while (exit < quantity) {
                try {
                    exit++;
                    if (exit % 2 == 0) {
                        queue.offerFirst(reader.nextLine());
                    } else {
                        queue.offerLast(reader.nextLine());
                    }

                } catch (Exception e) {
                    System.out.println("Illegal symbol");
                }
            }
            while (queue.peek() != null) {
                System.out.println(queue.pollFirst());
            }
        } finally {
            reader.close();
        }
    }
}
