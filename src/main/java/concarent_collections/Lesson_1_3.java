package concarent_collections;

import java.util.*;

/**
 * SET Множества
 java.util.EnumSet
 java.util.HashSet
 java.util.LinkedHashSet
 java.util.TreeSet
 * @autor irinaff
 * @since 21.04.2019
 **/

public class Lesson_1_3 {

    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("cakes");
        set.add("girls");
        System.out.println(set.contains("cakes"));//true

        //Set set0 = new EnumSet();
        Set set1 = new HashSet();
        Set set2 = new LinkedHashSet();
        Set set3 = new TreeSet();
    }
}
