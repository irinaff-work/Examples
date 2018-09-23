package serialize.test3;

import java.io.*;
public class RandomClass implements Serializable {
    // Генерация рандомного значения
    private static int r() {
        return (int) (Math.random() * 10);
    }

    private int data[];

    // Конструктор
    public RandomClass() {
        data = new int[r()];
        //System.out.println(r());
        for (int i=0; i < data.length; i++) {
            data[i] = (int) (Math.random() * 10);
        }
    }

    public void printout() {
        System.out.print("data=");
        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + ", ");
        }
        System.out.println("");
    }
}
