public abstract class Mammal {
    public String breed;
    public int nOfTeeth;

    public Mammal() {
        System.out.println("Mammal constuctor running.");
        nOfTeeth = 5;
        walk();
    }

    protected abstract void walk();

    public void showTeeth() {
        System.out.println("Shows mammal teeth :D");
        System.out.println(nOfTeeth);
    }
}
