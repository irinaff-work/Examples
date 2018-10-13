package reflection_api.example_2;

import org.omg.CORBA.FieldNameHelper;

public class Foo extends FieldNameHelper {

    public String arg1 = "arg1";

    public String arg2 = "juhf";

    public int arg3 = 5;

    public float arg4 = 123.34f;

    protected String arg5 = "protected arg";

    private String arg6 = "private arg";

    public void forName(String s) {
        System.out.println("invoke forName");
    }

    public void metod2(Integer i, String s) {
        System.out.println("invoke metod2");
        //return 2;
    }
}
