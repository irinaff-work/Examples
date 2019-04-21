package concarent_collections.lesson_1_8;

/**
 *
 * @autor irinaff
 * @since 18.04.2019
 **/

public class Pet {
    private Integer age;
    private String name;

    public Pet (Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getAge() + "" + this.getName();
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
