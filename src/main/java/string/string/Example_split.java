package string.string;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 03.04.2019
 **/

public class Example_split {
    public static void main(String[] args) {
        String Str = new String("Добро-пожаловать-на-ProgLang.su");

        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-")) {
            System.out.println(retval);
        }

        String formatInOut = "2011-12-03T10:15:30 -> Tue, 3 Jun 2008 11:05:30 GMT";
        for (String retval : formatInOut.split(" -> ", 2)) {
            System.out.println(retval);
        }
        String[] formats = formatInOut.split(" -> ", 2);
        System.out.println(formats[0]);
        System.out.println(formats[1]);
    }
}
