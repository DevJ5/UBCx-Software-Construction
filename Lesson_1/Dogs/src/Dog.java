import java.util.ArrayList;

public class Dog {
    protected String name;
    public String breed;
    public String owner;
    public int age;
    public Dog baby;
    public ArrayList<Integer> codes;

    public static final int MAX_AGE = 25;

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Woof woof");
    }
}