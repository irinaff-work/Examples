package designPatterns.creational.abstractFactory.example_1.factories;

import designPatterns.creational.abstractFactory.example_1.buttons.Button;
import designPatterns.creational.abstractFactory.example_1.buttons.MacOSButton;
import designPatterns.creational.abstractFactory.example_1.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.example_1.checkboxes.MacOSCheckbox;


/**
 * Конкретная фабрика (MacOS)
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
