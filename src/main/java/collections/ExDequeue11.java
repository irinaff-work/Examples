package collections;

import java.util.*;

public class ExDequeue11 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in).useDelimiter("\\s+");
        try {
            int quantity = reader.nextInt();
            Deque<Integer> queue = new ArrayDeque<>();
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < quantity; i++) {
                int element;
                switch (reader.next()) {
                    case "push":
                        element = Integer.valueOf(reader.nextInt());
                        queue.offerLast(element);
                        list.add(element);
                        break;
                    case "pop":
                        list.remove(queue.peekLast());
                        queue.pollFirst();
                        break;
                    case "max":
                        System.out.println(maxElement(list));
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("illegal input symbol");
        } finally {
            reader.close();
        }
    }

    static Integer maxElement(List<Integer> list) {
        Integer max = 0;
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
}
