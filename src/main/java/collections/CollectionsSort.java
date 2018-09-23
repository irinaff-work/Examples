package collections;

import javax.management.ObjectName;
import java.util.*;

public class CollectionsSort {
    public static void main(String[] args) {
        //Если нужно отсортировать коллекцию, то применяйте метод Collections.sort()
        List list = new ArrayList();

        Collections.sort(list, new Comparator<ObjectName>(){
            @Override
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        //Если требуется отсортировать массив, используйте метод Arrays.sort()
        ObjectName[] arr = new ObjectName[10];
        Arrays.sort(arr, new Comparator<ObjectName> () {
            @Override
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        //Применение самосортирующихся структур данных
        //Если нужно отсортировать список (List) или множество (Set), используйте структуру TreeSet для сортировки
        Set sortedSet = new TreeSet(new Comparator<ObjectName>() {
            @Override
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
        sortedSet.addAll(list);

        //Если вам требуется отсортировать словарь (Map),
        // используйте структуру TreeMap для сортировки. TreeMap сортируется по ключу (key).
        // TreeMap – использующий String ключи и компаратор (Comparator) CASE_INSENSITIVE_ORDER,
        // упорядочивающий строки (String) методом compareToIgnoreCase
        Map sortedMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        Map unsortedMap = new HashMap();
        sortedMap.putAll(unsortedMap);

        //TreeMap – общий случай, компаратор указывается вручную
        Map sortedMap1 = new TreeMap(new Comparator<ObjectName>() {
            @Override
            public int compare(ObjectName o1, ObjectName o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        sortedMap.putAll(unsortedMap);
    }
}
