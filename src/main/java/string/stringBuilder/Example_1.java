package string.stringBuilder;

/**
 * Класс StringBuilder идентичен классу StringBuffer и
 * обладает большей производительностью.
 * Однако он не синхронизирован, поэтому его не нужно использовать
 * в тех случаях, когда к изменяемой строке обращаются несколько потоков.
 */
public class Example_1 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        //Добавляем новый фрагмент в существующую строку:
        builder.append('h'); // можно добавить один символ
        builder.append("sometext"); // а можно добавить готовую строку
        String completedString = builder.toString(); // результирующая строка

        //Соединять строки можно цепочкой.
        String s1 = "123";
        String s2 = "456";
        String s3 = "789";
        System.out.println(new StringBuilder().append(s1).append(s2).append(s3).toString());
        //Данный код работает чуть быстрее, чем вызов append() по отдельности. Но это будет заметно при очень больших объёмах.
    }
}
