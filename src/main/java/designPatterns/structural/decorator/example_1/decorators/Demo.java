package designPatterns.structural.decorator.example_1.decorators;

import designPatterns.structural.decorator.example_1.decorators.*;
/**
 * Created by IFatkullina on 25.09.2018.
 * Клиентский код
 */
public class Demo {
    public static void main(String[] args) {
        //
        String inData = "Name,age\nMicael,22\nAnna,43";

        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("src/main/resources/OutputDemo.txt")));

//        DataSourceDecorator encoded = new EncryptionDecorator(
//                        new FileDataSource("src/main/resources/OutputDemo.txt"));

        encoded.writeData(inData);

        DataSource readData = new FileDataSource("src/main/resources/OutputDemo.txt");

        System.out.println("- Input ----------------");
        System.out.println(inData);
        System.out.println("- Encoded --------------");
        System.out.println(readData.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}