package reflection_api.example_2;

import java.lang.reflect.Field;

//Пример изменения значения закрытого поля класса
public class Demo_5 {
    public static void main(String[] args) throws Exception{
        /*
        Чтобы изменить значение закрытого (private) поля класса необходимо
        получить это поле методом getDeclaredField () и
        вызвать метод setAccessible (true) объекта Field, чтобы открыть доступ к полю.
        После этого значение закрытого поля можно изменять, если оно не final.

        В следующем примере определен внутренний класс PrivateFinalFields
        с набором закрытых полей; одно из полей final.
        При создании объекта класса поля инициализируются.
        В методе main примера поочередно в закрытые поля
        вносятся изменения и свойства объекта выводятся в консоль.
         */
        PrivateFinalFields pf = new PrivateFinalFields();

        Field f = pf.getClass().getDeclaredField("i1");
        f.setAccessible(true);
        f.setInt(pf, 47);
        System.out.println("1. " + pf);

        f = pf.getClass().getDeclaredField("s1");
        f.setAccessible(true);
        f.set(pf, "MODIFY S");
        System.out.println("2. " + pf);

        f = pf.getClass().getDeclaredField("s2");
        f.setAccessible(true);
        f.set(pf, "MODIFY S2");

        f = pf.getClass().getDeclaredField("i1");
        f.setAccessible(true);
        f.setInt(pf, 35);
        System.out.println("3. " + pf);
    }
    /*
    Из приведённого примера видно что поля private можно изменять.
    Для этого необходимо получить объект типа java.lang.reflect.Field
    с помощью метода getDeclaredField (), вызвать его метод setAccessible (true)
    и с помощью метода set () установить требуемое значение поля.
    Необходимо иметь в виду, что наличие модификатора final
    в закрытом текстовом поле не вызывает исключений при изменении значений,
    а само значение поля остаётся прежним, т.е. final поля остаются неизменные.
    Если не вызвать метод открытия доступа к полю setAccessible (true),
    то будет вызвано исключение java.lang.IllegalAccessException.
     */
}
