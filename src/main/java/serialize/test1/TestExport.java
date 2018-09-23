package serialize.test1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by IFatkullina on 21.09.2018.
 */
public class TestExport {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        TestSerial ts = new TestSerial();
        //фактическая сериализация объекта
        oos.writeObject(ts);
        oos.flush();
        oos.close();
    }


}
