import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog("Fido"));
        dogs.add(new Dog("Fluffy"));
        for (Dog dog : dogs) {
            System.out.print(dog.name + ": ");
            dog.bark();
            System.out.println(dog.owner);
            System.out.println(dog.age);
            System.out.println(dog.baby);
        }

        System.out.println(Dog.MAX_AGE);
    }


}
