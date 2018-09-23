package serialize.test2.defaultChange;

/**
 * Created by IFatkullina on 21.09.2018.
 * сохранение объекта PersistentTime
 * Реальная работа выполняется в 200-й строке, когда мы вызываем метод ObjectOutputStream.writeObject(),
 * который запускает механизм сериализации и объект разлагается на байты (в данном случае в файл)
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AnimationOut {
    public static void main(String[] args) {
        String filename = "animation.ser";
        if (args.length > 0) {
            filename = args[0];
        }
        PersistentAnimation animation = new PersistentAnimation(5);
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(animation);
            out.flush();
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
