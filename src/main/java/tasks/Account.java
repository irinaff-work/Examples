package tasks;

public class Account {
    /**
     * 8.	Пользователь делает вклад на несколько лет, на который каждый год начисляется 10%.
     Написать ф-ю, принимающую сумму и срок вклада, и возвращающую сумму, которая будет на счету пользователя.
     Можно использовать любой язык программирования, либо псевдокод.
     * @param initialSum изначальная сумма вклада
     * @param years         срок вклада (количество лет)
     * @return сумма, корая будет на счету через {years} лет при начислении 10% в год
        double calculateSum(double initialSum, int years);
     **/


    public static void main(String[] args) {
        double initialSum = 125;
        int years = 10;
        double sum = calculateSum(initialSum,years);
        System.out.printf("%,16f%n", sum);
    }

    static double calculateSum(double initialSum, int years) {
        double initialSum1 = initialSum;
        for ( int i = 1; i <= years; i++ ){
            initialSum1 = initialSum1 + initialSum1 * 1.1;
            System.out.printf("%,16f%n", initialSum1);
            //System.out.println("");
        }

        return (initialSum + initialSum * 1.1 * years);

    }

}
