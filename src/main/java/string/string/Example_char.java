package string.string;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 09.04.2019
 **/

public class Example_char {
    public static void main(String[] args) {
        String s = "Длинная строка";
        char result1 = s.charAt(0);
        char result2 = s.charAt(8);
        System.out.println("Нулевой символ строки - " + result1);
        System.out.println("Восьмой символ строки - " + result2);
    }
}
