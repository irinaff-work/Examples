package designPatterns.creational.singleton.thread_safe;
/**
 Пример: Правильный Одиночка (thread-safe)
 Чтобы исправить проблему, требуется синхронизировать потоки при создании объекта-Одиночки.
 OutputDemoMultiThread.txt: Результаты выполнения
 If you see the same value, then singleton was reused (yay!)
 If you see different values, then 2 singletons were created (booo!!)

 RESULT:

 BAR
 BAR
 */