package serialize.test4;

import java.io.*;

public class SerTest {
    public static void main(String[] args) {
        try
        {
            Person ted = new Person("Ted", "Neward", 39);
            Person charl = new Person("Charlotte",
                    "Neward", 38);

            ted.setSpouse(charl);
            charl.setSpouse(ted);

            System.out.println("Ted (1): " + ted.getAge());

            FileOutputStream fos = new FileOutputStream("tempdata.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(ted);
            oos.close();
        }
        catch (Exception ex)
        {
            System.out.println("Exception thrown during test: " + ex.toString());
        }

        try
        {
            FileInputStream fis = new FileInputStream("tempdata.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person ted = (Person) ois.readObject();
            ois.close();
            System.out.println("Ted (2): " + ted.getAge());//ted.getFirstName());
            //System.out.println("Charlotte: " + ted.getSpouse().getFirstName());

            // Clean up the file
            new File("tempdata.ser").delete();
        }
        catch (Exception ex)
        {
            System.out.println("Exception thrown during test: " + ex.toString());
        }
    }

}

