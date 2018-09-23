package serialize.test2.defaultMethod;

/**
 * Created by IFatkullina on 21.09.2018.
 * сохранение объекта PersistentTime
 * Реальная работа выполняется в 200-й строке, когда мы вызываем метод ObjectOutputStream.writeObject(),
 * который запускает механизм сериализации и объект разлагается на байты (в данном случае в файл)
 */

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class FlattenTime
{
    public static void main(String [] args)
    {
      String filename = "time.ser";
      if(args.length > 0)
     {
       filename = args[0];
     }
     PersistentTime time = new PersistentTime();
     FileOutputStream fos = null;
     ObjectOutputStream out = null;
     try
     {
       fos = new FileOutputStream(filename);
       out = new ObjectOutputStream(fos);
       out.writeObject(time);
       out.close();
     }
      catch(IOException ex)
     {
       ex.printStackTrace();
     }
   }
 }
