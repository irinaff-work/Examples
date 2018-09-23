package designPatterns.creational.abstractFactory.example_1.factories;

import designPatterns.creational.abstractFactory.example_1.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.example_1.buttons.Button;

/**
 * Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
 */
public interface GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
