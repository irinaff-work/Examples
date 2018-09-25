package designPatterns.structural.decorator.example_1.decorators;

/**
 * Created by IFatkullina on 25.09.2018.
 * Интерфейс, задающий базовые операции чтения и записи данных
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
