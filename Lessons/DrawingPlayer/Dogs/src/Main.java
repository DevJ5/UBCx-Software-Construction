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

    static class Dog {
        protected String name;
        public String breed;
        private String owner;
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

}


