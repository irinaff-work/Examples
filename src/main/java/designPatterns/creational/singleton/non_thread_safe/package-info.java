package designPatterns.creational.singleton.non_thread_safe;
/**
 Пример: Наивный Одиночка (один поток)
 Топорно реализовать Одиночку очень просто — достаточно скрыть
 конструктор и предоставить статический создающий метод.

 OutputDemoSingleThread.txt: Результаты выполнения
 If you see the same value, then singleton was reused (yay!)
 If you see different values, then 2 singletons were created (booo!!)

 RESULT:

 FOO
 FOO
 */