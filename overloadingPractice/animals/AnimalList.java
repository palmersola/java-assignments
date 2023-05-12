package overloadingPractice.animals;

import overloadingPractice.animals.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Jeremy"));
        animals.add(new Animal("Boggs", true));
        animals.add(new Animal("Angel"));
        animals.add(new Animal("Chango", true));

        System.out.println("Animal Menu\nEntering nothing will stop the loop");
        while (true) {
            System.out.println("Please enter a name:");
            String name = scanner.nextLine();
            if(name.equals("")) break;
            System.out.println("Is this animal a dog?");
            boolean isDog = scanner.nextLine().equalsIgnoreCase("y");
            animals.add(new Animal(name, isDog));
        };

       for (Animal animal: animals) {
           System.out.println(animal.getName() + " is a dog: " + animal.getIsDog());
       }
    }
}
