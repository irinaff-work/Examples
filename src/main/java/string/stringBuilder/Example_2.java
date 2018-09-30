package string.stringBuilder;

import java.util.Random;

/**
 * http://developer.alexanderklimov.ru/android/java/string.php
 * Генерируем случайную строку
 * Допустим, нам нужна случайная строка из заданных символов.
 */
public class Example_2 {
    public static void main(String[] args) {

        String mCHAR = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        final int STR_LENGTH = 9; // длина генерируемой строки
        Random random = new Random();

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < STR_LENGTH; i++) {
            int number = random.nextInt(mCHAR.length());
            char ch = mCHAR.charAt(number);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
