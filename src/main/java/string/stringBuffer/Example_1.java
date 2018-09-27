package string.stringBuffer;

/**
 * Класс StringBuffer представляет расширяемые и доступные для изменений
 * последовательности символов, позволяя вставлять символы и
 * подстроки в существующую строку и в любом месте. Данный класс
 * гораздо экономичнее в плане потребления памяти и настоятельно рекомендуется к использованию.
 */
public class Example_1 {

    public static void main(String[] args) {
        //length() Метод позволяет получить текущую длину объекта
        StringBuffer sb = new StringBuffer("Котэ");
        System.out.println("Длина: " + sb.length());

        //capacity() Метод позволяет получить текущий объём выделенной памяти.
        System.out.println("Объём памяти: " + sb.capacity());

        //charAt(int index) и setCharAt(int index, char ch)
        //Можно извлечь значение отдельного символа с помощью метода charAt()
        // и установить новое значение символа с помощью метода setCharAt(),
        // указав индекс символа и его значение.
        System.out.println(sb.charAt(1));
        sb.setCharAt(1, 'O');
        System.out.println(sb.toString());

        //insert() Вставляет одну строку в другую
        StringBuffer sb2 = new StringBuffer("Я Котов");
        sb2.insert(2, "Люблю ");
        System.out.println(sb2.toString());
    }
}
