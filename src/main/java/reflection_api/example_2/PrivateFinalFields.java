package reflection_api.example_2;

public class PrivateFinalFields {
    private       int    i1  = 1;
    private final String s1  = "String S";
    private       String s2 = "String S2";

    public String toString() {
        return "i1 = " + i1 + ", " + s1 + ", " + s2;
    }
}
