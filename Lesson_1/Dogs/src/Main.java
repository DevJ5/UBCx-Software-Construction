import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Fido"));
        dogs.add(new Dog("Flufffy"));
        for (Dog dog : dogs) {
            System.out.print(dog.name + ": ");
            dog.bark();
        }
    }

    public static class Dog {
        String name;

        public Dog(String name) {
            this.name = name;
        }

        public void bark() {
            System.out.println("Woof woof");
        }
    }
}
