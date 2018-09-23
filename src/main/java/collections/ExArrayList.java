package collections;

import java.util.*;

public class ExArrayList {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>(); // create a list of strings

        boolean isEmpty = nameList.isEmpty(); // true, it's empty
        int listSize = nameList.size();       // the size is 0

        //Add 4 elements to the collection 

        nameList.add("Mr.Green");
        nameList.add("Mr.Red");
        nameList.add("Mr.Yellow");
        nameList.add("Mr.Red");

        isEmpty = nameList.isEmpty(); // false, it's not empty
        listSize = nameList.size();   // the size is 4

        int elementIndex = nameList.indexOf("Mr.Yellow");  // elementIndex is 2
        String elementItself = nameList.get(elementIndex); // elementItself is "Mr.Yellow"


        /**
         Replace the item in the specified position
         nameList is [Mr.Green, Mr.Red, Mr.Brown, Mr.Red]
         */
        nameList.set(elementIndex, "Mr.Brown");

        /**
         Delete the item in the specified position
         nameList is [Mr.Green, Mr.Brown, Mr.Red]
         */
        nameList.remove(1);

        /**
         Clear the entire list
         nameList is []
         */
        //nameList.clear();

        //Другие операции с полезным списком

        //1) Итерирование по списку с использованием цикла «для каждого»

        for (String name : nameList) {
            System.out.println(name);
        }

        //или

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i));
        }

        //2) Преобразование списка в массив

        Object[] objArray = nameList.toArray();

        //или если нам нужен массив строк

        String[] strArray = nameList.toArray(new String[0]);

        //3) Преобразование массива в список

        List<String> list = java.util.Arrays.asList("one", "two", "three");

        //4) Sublist

        List<Integer> numList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(numList.subList(1, 3)); //[20, 30]

        numList.subList(1, 3).clear();

        System.out.println(numList); //[10, 40, 50]

        List<GreekLetter> letterList = new ArrayList<>();
        letterList.add(new GreekLetter("Gamma", 3));
        letterList.add(new GreekLetter("Omega", 24));
        letterList.add(new GreekLetter("Alpha", 1));


        //write your code here
        Object[] objArray2 = letterList.toArray();

        for (int i = 0; i < objArray2.length; i++) {
            System.out.println("objArray2=" + objArray2[i]);
        }
    }

    static class GreekLetter {

        private String letter;
        private Integer position;

        public GreekLetter(String letter, Integer position) {
            this.letter = letter;
            this.position = position;
        }

        @Override
        public String toString() {
            return "{" +
                    "letter='" + letter + '\'' +
                    ", position=" + position +
                    '}';
        }
    }

}
