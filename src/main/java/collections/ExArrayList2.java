package collections;

import java.util.Scanner;

public class ExArrayList2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            System.out.println(sc.nextLine());

            String input = sc.nextLine();//"1 2 3 4 5 6 7";
            String[] list1 = input.split(" ");

            System.out.println("list1:" + list1.length);

            for (int i = 0; i < list1.length; i++) {
                //System.out.println("i="+i+"; list1[i]="+ list1[i]);
                if (i % 2 == 0) {
                    list1[i] = null;
                }
            }
            for (int i = list1.length - 1; i > 0; i--) {
                if ((list1[i] != null && !list1[i].isEmpty())) {
                    System.out.print(list1[i] + " ");
                }
            }
        }
    }
}
