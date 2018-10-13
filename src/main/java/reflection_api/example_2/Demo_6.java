package reflection_api.example_2;

//Пример вызова метода, invoke
public class Demo_6 {
    /*
    Java Reflection Api позволяет вызвать метод класса.
    Рассмотрим пример, в котором определим класс Reflect,
    включающий поля и методы управления ими.
    В режиме run-time с помощью метода данного класса
    будем изменять значения полей и распечатывать их.
     */
    public static void main(String[] args) {
        Reflect reflect = new Reflect();
        ReflectionTest reflectionTest = new ReflectionTest(reflect);
    }
}
