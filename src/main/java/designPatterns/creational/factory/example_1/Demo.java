package designPatterns.creational.factory.example_1;

import designPatterns.creational.factory.example_1.factory.Dialog;
import designPatterns.creational.factory.example_1.factory.HtmlDialog;
import designPatterns.creational.factory.example_1.factory.WindowsDialog;

/**
 * Клиентский код
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    private static Dialog dialog;

    public static void main(String[] args) {
        System.out.println(System.getProperty("os.name"));
        configure();
        runBusinessLogic();
    }

    /**
     * Приложение создаёт определённую фабрику в зависимости от конфигурации или
     * окружения.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 7")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * Весь остальной клиентский код работает с фабрикой и продуктами только
     * через общий интерфейс, поэтому для него неважно какая фабрика была
     * создана.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
