package collections;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap1 {
    public static void main(String[] args) {
        Map<Integer, String> products = new HashMap<>(); // unordered map of products

        products.put(1000, "Notebook");
        products.put(2000, "Phone");
        products.put(3000, "Keyboard");

        System.out.println(products); // {2000=Phone, 1000=Notebook, 3000=Keyboard}

        String notebook = products.get(1000); // "Notebook"
        String noSuchProduct = products.get(4000); // it's null

        // iterating over pairs of the map
        for (Map.Entry<Integer, String> product : products.entrySet()) {
            System.out.println(product.getKey() + ": " + product.getValue());
        }

        // iterating over values of the map
        for (String productName : products.values()) {
            System.out.println(productName);
        }
    }
}
