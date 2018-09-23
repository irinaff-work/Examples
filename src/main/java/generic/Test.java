package generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    static void printList(List<?> list) {
        for (Object l : list)
            System.out.println("{" + l + "}");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(100);
        printList(list);
        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("100");
        printList(strList);
        List<?> intList = new ArrayList<Integer>();
        list.add(10);
        //intList.add(new Integer(10));
        //intList.add(new Float(10.0f));

        List<? extends Number> numList = new ArrayList<Integer>();
        //numList = new ArrayList<String>();

        List<? super Integer> intList2 = new ArrayList<Integer>();
        System.out.println("The intList is: " + intList2);
    }

    public static Double sum(List<? extends Number> numList) {
        Double result = 0.0;
        for (Number num : numList) {
            result += num.doubleValue();
        }
        return result;
    }


}
