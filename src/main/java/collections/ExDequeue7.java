package collections;

import java.util.*;

public class ExDequeue7 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            int exit = 0;
            Deque<String> queue1 = new ArrayDeque<>();
            Deque<String> queue2 = new ArrayDeque<>();

            Integer quantity = Integer.valueOf(reader.nextLine());

            int load1 = 0;
            int load2 = 0;

            while (exit < quantity) {
                try {
                    exit++;
                    String[] s = reader.nextLine().split(" ");

                    if (load1 <= load2) {
                        queue1.offerLast(s[0]);
                        load1 = load1 + Integer.valueOf(s[1]);
                    } else {
                        queue2.offerLast(s[0]);
                        load2 = load2 + Integer.valueOf(s[1]);
                    }

                } catch (Exception e) {
                    System.out.println("Illegal symbol");
                }
            }
            while (queue1.peek() != null) {
                System.out.print(queue1.pollFirst() + " ");
            }
            System.out.println("");

            while (queue2.peek() != null) {
                System.out.print(queue2.pollFirst()  + " ");
            }
        } finally {
            reader.close();
        }
    }
}
