package serialize.test1;

import java.io.Serializable;

/**
 * Created by IFatkullina on 21.09.2018.
 */
public class TestSerial implements Serializable{
    public byte version = 100;
    public byte count = 0;

    private String p1;
    protected int p2;

    void m1 () {
        System.out.println(p1 + "!!!" + p2);
    }
}
