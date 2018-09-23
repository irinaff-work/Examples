package designPatterns.creational.factory.example_1.factory;

import designPatterns.creational.factory.example_1.buttons.Button;
import designPatterns.creational.factory.example_1.buttons.HtmlButton;

/**
 * Конкретный класс диалогов
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
