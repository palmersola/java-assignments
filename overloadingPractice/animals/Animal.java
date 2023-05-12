package overloadingPractice.animals;

public class Animal {
    String name;
    boolean isDog = false;

    public Animal (String name) {
        this.name = name;
    }
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return this.name;
    }

    public boolean getIsDog() {
        return this.isDog;
    }
}
