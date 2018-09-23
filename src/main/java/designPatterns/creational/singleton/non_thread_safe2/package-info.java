package designPatterns.creational.singleton.non_thread_safe2;
/**
 Тот же класс ведёт себя неправильно в многопоточной среде.
 Несколько потоков могут одновременно вызвать метод получения Одиночки
 и создать сразу несколько экземпляров объекта.

 OutputDemoMultiThread.txt: Результаты выполнения
 If you see the same value, then singleton was reused (yay!)
 If you see different values, then 2 singletons were created (booo!!)

 RESULT:

 FOO
 BAR
 */