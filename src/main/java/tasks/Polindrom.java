package tasks;

public class Polindrom {
    /**
     * 9.	Задача со звёздочкой. Необязательная.
     Написать функцию, проверяющую, является ли массив палиндромом.
     Можно использовать любой язык программирования, либо псевдокод.
     [1,2,3,2,1] – палиндром
     [1,2,2,1] -палиндром
     [1,2,3,2,1,0] – не палиндром
     */


    static boolean isArrayPolindrom(int[] arg) {
        for (int i=0, k = arg.length -1; i < (arg.length)/2; i++, k--) {
            if (arg[i] != arg[k]) {
                return false;
            }
        }
        return true;
    }

    static void test(int arg) {
        for (int i=0, k = arg; i <= arg/2; i++, k--) {
            System.out.println("i=" + i+ ", k=" + k);
        }
    }
    public static void main(String[] args) {
        int[] param1 = {1,2,3,2,1};
        int[] param2 = {1,2,2,1};
        int[] param3 = {1,2,3,2,1,0};

        //System.out.println(param1.length/2);
        //System.out.println(param2.length/2);
        //System.out.println(param3.length/2);
        //test(param1.length);
        System.out.println(isArrayPolindrom(param1));
        System.out.println(isArrayPolindrom(param2));
        System.out.println(isArrayPolindrom(param3));
    }
}
