import java.util.ArrayList;

public class Dog extends Mammal implements Animal  {
    protected String name;
    private String breed;
    public String owner;
    public int age;
    public Dog baby;
    public ArrayList<Integer> codes;

    public static final int MAX_AGE = 25;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof woof");
    }

    public void walk() {
        System.out.println(this.name + " walking");
    }

    public void showTeeth() {
        nOfTeeth = 23;
        System.out.println("Shows dog :D");
    }
}