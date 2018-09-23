package collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

//Евгений Х. Congratulations! You have improved the best code complexity for this step, your score is 34.79 (less is better).
public class ExDequeue9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\\s+");
        //Scanner scan1 = new Scanner(System.in);
        int num = scan.nextInt();
        //scan.close();
        Deque<Integer> first = new ArrayDeque<>();
        Deque<Integer> second = new ArrayDeque<>();
        int firstLoad = 0;
        int secondLoad = 0;

        //Scanner scan = new Scanner(System.in).useDelimiter("\\s+");
        for (int i = 0; i < num; i++) {
            int id = scan.nextInt();
            int load = scan.nextInt();
            if (firstLoad <= secondLoad) {
                first.addLast(id);
                firstLoad += load;
            } else {
                second.addLast(id);
                secondLoad += load;
            }
        }
        for (Integer i : first) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (Integer i : second) {
            System.out.print(i + " ");
        }
    }

}
