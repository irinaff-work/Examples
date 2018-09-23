package collections;

import java.util.*;

//Илья Соловьёв
public class ExDequeue10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Map<Integer, Integer>> queue1 = new LinkedList<>();
        Queue<Map<Integer, Integer>> queue2 = new LinkedList<>();
        scanner.next();
        Map<Integer, Integer> buffer;
        while(scanner.hasNextInt()) {
            buffer = new HashMap<>();
            buffer.put(scanner.nextInt(), scanner.nextInt());
            if (queue1.isEmpty() || queue1.stream().mapToInt(x -> x.values().stream().findFirst().orElse(0)).sum()
                    <= queue2.stream().mapToInt(x -> x.values().stream().findFirst().orElse(0)).sum()) {
                queue1.offer(buffer);
            } else {
                queue2.offer(buffer);
            }
        }
        printQueue(queue1);
        System.out.println();
        printQueue(queue2);
    }
    private static void printQueue(Queue<Map<Integer, Integer>> queue) {
        String delimiter = "";
        for (Map<Integer, Integer> element : queue) {
            for(Integer i : element.keySet()) {
                System.out.print(delimiter + i);
                if (delimiter.isEmpty()) delimiter = " ";
            }
        }
    }
}
