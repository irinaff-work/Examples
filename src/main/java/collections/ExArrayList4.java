package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExArrayList4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String input = sc.nextLine();//"Google Oracle JetBrains";

            List<String> list1 = new ArrayList<>(Arrays.asList(input.split(" ")));

            System.out.print(list1);
//            System.out.print("[");
//            for (int i = 0; i < list1.size(); i++) {
//                {
//                    System.out.print(list1.get(i));
//                    if (i != list1.size() - 1) {
//                        System.out.print(", ");
//                    }
//                }
//            }
//            System.out.print("]");
        }
    }
}
