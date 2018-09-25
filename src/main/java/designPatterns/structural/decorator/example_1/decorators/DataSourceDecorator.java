package designPatterns.structural.decorator.example_1.decorators;

/**
 * Created by IFatkullina on 25.09.2018.
 * Базовый декоратор
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
