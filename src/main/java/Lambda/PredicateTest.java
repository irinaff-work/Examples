package Lambda;

import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

//https://habr.com/ru/post/216431/
public class PredicateTest {
    public static void main(String[] args) {

        //Предикаты — это функции, принимающие один аргумент, и возвращающие значение типа boolean.
        // Интерфейс содержит различные методы по умолчанию,
        // позволяющие строить сложные условия (and, or, negate).
        Predicate<String> predicate = (s) -> s.length() > 0;

        predicate.test("foo");              // true
        predicate.negate().test("foo");     // false

        Predicate<Boolean> nonNull = Objects::nonNull;
        Predicate<Boolean> isNull = Objects::isNull;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNotEmpty = isEmpty.negate();

        //Функции принимают один аргумент и возвращают некоторый результат.
        // Методы по умолчанию могут использоваться для построения цепочек вызовов (compose, andThen).
        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);

        backToString.apply("123");     // "123"

        //Поставщики (suppliers) предоставляют результат заданного типа.
        // В отличии от функций, поставщики не принимают аргументов.

        Supplier<Person> personSupplier = Person::new;
        personSupplier.get();   // new Person

        //Потребители (consumers) представляют собой операции,
        //которые производятся над одним входным аргументом.

        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.firstName);
        greeter.accept(new Person("Luke", "Skywalker"));

        //Компараторы хорошо известны по предыдущим версиям Java.
        // Java 8 добавляет в интерфейс различные методы по умолчанию.
        Comparator<Person> comparator = (p1, p2) -> p1.firstName.compareTo(p2.firstName);
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Alice", "Wonderland");

        comparator.compare(p1, p2);             // > 0
        comparator.reversed().compare(p1, p2);  // < 0

        //Опциональные значения (optionals) не являются функциональными интерфейсами,
        //однако являются удобным средством предотвращения NullPointerException.
        //Опциональные значение — это по сути контейнер для значения,
        //которое может быть равно null. Например, вам нужен метод,
        //который возвращает какое-то значение, но иногда он должен возвращать пустое значение.
        //Вместо того, чтобы возвращать null, в Java 8 вы можете вернуть опциональное значение.

        Optional<String> optional = Optional.of("bam");
        optional.isPresent();           // true
        optional.get();                 // "bam"
        optional.orElse("fallback");    // "bam"
        optional.ifPresent((s) -> System.out.println(s.charAt(0)));     // "b"
    }
}
