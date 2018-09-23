package matcher;

import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        String s = "111111111111";
        Pattern numericPattern = Pattern.compile("[0-9]{12}");
        if (numericPattern.matcher(s).find()) {
            System.out.println("find");
        }

    }
}
