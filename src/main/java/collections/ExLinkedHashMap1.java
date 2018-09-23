package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExLinkedHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> products = new LinkedHashMap<>(); // ordered map of products

        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products); // it's always ordered {1000=Notebook, 2000=Phone, 3000=Keyboard}
    }
}
