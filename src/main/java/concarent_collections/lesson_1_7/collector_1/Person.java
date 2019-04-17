package concarent_collections.lesson_1_7.collector_1;

/**
 * TODO: comment
 *
 * @autor irinaff
 * @since 29.03.2019
 **/

public class Person {
    String name;
    int age;
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}
