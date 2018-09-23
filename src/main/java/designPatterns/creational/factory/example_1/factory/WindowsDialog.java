package designPatterns.creational.factory.example_1.factory;

import designPatterns.creational.factory.example_1.buttons.Button;
import designPatterns.creational.factory.example_1.buttons.WindowsButton;

/**
 * Ещё один класс диалогов
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
