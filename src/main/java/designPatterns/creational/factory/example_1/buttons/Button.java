package designPatterns.creational.factory.example_1.buttons;

/**
 * Общий интерфейс кнопок
 * Общий интерфейс для всех продуктов.
 */
public interface Button {
    public void render();
    public void onClick();
}
