package designPatterns.creational.builder.example_1.builders;

//Общий интерфейс строителей

import designPatterns.creational.builder.example_1.cars.Type;
import designPatterns.creational.builder.example_1.components.Engine;
import designPatterns.creational.builder.example_1.components.GPSNavigator;
import designPatterns.creational.builder.example_1.components.Transmission;
import designPatterns.creational.builder.example_1.components.TripComputer;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */
public interface Builder {
    public void setType(Type type);
    public void setSeats(int seats);
    public void setEngine (Engine engine);
    public void setTransmission(Transmission transmission);
    public void setTripComputer(TripComputer tripComputer);
    public void setGPSNavigator(GPSNavigator gpsNavigator);
}
