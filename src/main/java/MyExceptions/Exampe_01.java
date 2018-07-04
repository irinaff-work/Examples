package MyExceptions;


import java.io.FileNotFoundException;
import java.io.IOException;

public class Exampe_01 {

    public static void main(String[] args) {
        Exception ex = twoExceptionsMethod();
        System.out.println(ex.getClass());

        String s = twoExceptionsMethod2();
        System.out.println(s);

        ioExcAndFileNotFoundEx();
    }

    public static Exception twoExceptionsMethod() {
        try {
            return new IndexOutOfBoundsException();
        } finally {
            return new NullPointerException();
        }
    }

    public static String twoExceptionsMethod2() {
        try {
            throw new NullPointerException();
        }catch (NullPointerException ex) {
            System.out.println(ex.getMessage()+ " catch");
        }
        finally {
            Exception ex2 = new Exception();
             return ex2.getMessage() + " finally";
        }
    }

    public static void ioExcAndFileNotFoundEx() {
        try {
            //TODO: some code
            String x = "abc1";
            if (x.equals("abc")) {
                throw new IOException("1");
            } else {
                throw new FileNotFoundException("2");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
