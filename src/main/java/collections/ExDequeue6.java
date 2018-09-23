package collections;

import java.util.*;

public class ExDequeue6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        try {
            while (reader.hasNext()) {
                Deque<String> queue = new ArrayDeque<>();
                String read = reader.nextLine();
                System.out.println(isBalanced(read));
            }
        } catch (Exception e) {
            System.out.println("Illegal symbol");
        } finally {
            reader.close();
        }
    }


    static boolean isBalanced(String s) {
        List<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        Deque<String> queue = new ArrayDeque<String>();
        for (String simbol : list) {
            if (simbol.equals("[") || simbol.equals("{") || simbol.equals("(")) {
                queue.offerLast(simbol);
            }
            if (simbol.equals("]") || simbol.equals("}") || simbol.equals(")")) {
                if (queue.peek() == null) {
                    return false;
                }
                queue.pop();
            }
        }
        if (queue.peek() != null) {
            return false;
        }
        return true;
    }
}
