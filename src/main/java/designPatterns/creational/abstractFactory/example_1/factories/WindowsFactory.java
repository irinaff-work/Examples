package designPatterns.creational.abstractFactory.example_1.factories;

import designPatterns.creational.abstractFactory.example_1.buttons.Button;
import designPatterns.creational.abstractFactory.example_1.buttons.WindowsButton;
import designPatterns.creational.abstractFactory.example_1.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.example_1.checkboxes.WindowsCheckbox;

/**
 * Конкретная фабрика (Windows)
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
