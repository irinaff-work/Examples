package concarent_collections.lesson_1_6.example_1;

import Lambda.Converter;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 23.03.2019
 **/

public class LambdaDemo {
    public static void main(String[] args) {
        Converter<Integer, String> conv = (from) -> from + "!!!";//implementation of the method convert() from Converter
        String s = conv.convert(10);
        System.out.println(s);//10!!!

        NumTest numTest = (n) -> (n % 2) == 0;//implementation of the method test() from NumTest
        System.out.println(numTest.test(10) ? "even" : "odd");//even}
    }
}
