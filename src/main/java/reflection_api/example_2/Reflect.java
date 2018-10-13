package reflection_api.example_2;

/*
Класс Reflect включает два закрытых поля (id, name) и
методы управления их значениями set/get.
Дополнительно в класс включим метод setData,
который будем вызывать для изменения значений полей,
и метод toString для печати их значений.
 */
public class Reflect {
    private String name;
    private int    id;

    Reflect() {
        name = "Test";
        id   = 999;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setData(final int id, String name) {
        this.id   = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Reflect [ id : " + id + ", name : " + name + "]";
    }
}
