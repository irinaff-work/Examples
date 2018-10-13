package reflection_api.example_1;

public class MyClass_2 {
    private int number;
    private String name = "default name";

    public MyClass_2(int number, String name) {
        this.number = number;
        this.name = name;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setName(String name) {
        this.name = name;
    }
    private void printData(){
        System.out.println(number + name);
    }
}
