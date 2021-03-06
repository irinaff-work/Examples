package stream;
/*
Новое в Java 8
https://habr.com/ru/post/216431/

Операции над потоками бывают или промежуточными (intermediate) или конечными (terminal).
Конечные операции возвращают результат определенного типа, а промежуточные операции возвращают тот же поток.
Таким образом вы можете строить цепочки из несколько операций над одним и тем же потоком.
Поток создаются на основе источников, например типов, реализующих java.util.Collection,
такие как списки или множества (ассоциативные массивы не поддерживаются).
Операции над потоками могут выполняться как последовательно, так и параллельно.

создавать потоки можно, используя вызовы Collection.stream() или Collection.parallelStream()
 */