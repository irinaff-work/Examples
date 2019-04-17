package stream;

import java.util.HashMap;
import java.util.Map;

public class Example_3 {
    //ассоциативные массивы (maps) не поддерживают потоки.
    // Вместо этого ассоциативные массивы теперь
    // поддерживают различные полезные методы,
    // которые решают часто встречаемые задачи.

    public static void main(String[] args) {

        //putIfAbsent позволяет нам не писать дополнительные проверки на null;
        // forEach принимает потребителя, который производит операцию над каждым элементом массива.
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.putIfAbsent(i, "val" + i);
        }
        map.forEach((id, val) -> System.out.println(val));

        //как использовать для вычислений код при помощи различных функций
        map.computeIfPresent(3, (num, val) -> val + num);
        System.out.println(map.get(3));             // val33

        map.computeIfPresent(9, (num, val) -> null);
        System.out.println(map.containsKey(9));     // false

        map.computeIfAbsent(23, num -> "val" + num);
        System.out.println(map.containsKey(23));    // true

        map.computeIfAbsent(3, num -> "bam");
        System.out.println(map.get(3));             // val33

        //Затем мы узнаем, как удалить объект по ключу, только если этот объект ассоциирован с ключом
        map.remove(3, "val3");
        System.out.println(map.get(3));             // val33

        map.remove(3, "val33");
        System.out.println(map.get(3));             // null

        //Еще один полезный метод
        System.out.println(map.getOrDefault(42, "not found"));  // not found

        //Объединить записи двух массивов
        //В случае отсутствия ключа Merge создает новую пару ключ-значение.
        // В противном случае — вызывает функцию объединения для существующего значения.
        map.merge(9, "val9", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9

        map.merge(9, "concat", (value, newValue) -> value.concat(newValue));
        System.out.println(map.get(9));             // val9concat
    }


}
