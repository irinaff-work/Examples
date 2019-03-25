package concarent_collections;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 23.03.2019
 * Lambda Expressions
 * FunctionalInterface - interface with one abstract method
 **/

public class Lesson_1_6 {
    public static void main(String[] args) {
        // Anonymous Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world one!");
            }
        };

        //Lambda Runnable
        Runnable r2 = () -> System.out.println("Hello world two!");
        //if the lambda_1 expression is not one string use {//method body}:
        Runnable r3 =() -> {
            System.out.println("Hello world two!");
            System.out.println("I'm better than r1");
        };

    }
}
