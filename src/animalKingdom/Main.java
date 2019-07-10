package animalKingdom;

import java.util.*;

public class Main
{
    public static void printFilteredList(ArrayList<Animal> array, Checker filter)
    {
        array.forEach(a -> 
        {
            if (filter.test(a))
            {
                System.out.println(a);
            }
        });
    }

    public static void main(String[] args)
    {
        // Create new ArrayList
        ArrayList<Animal> animalList = new ArrayList<>();

        // Add in Mammals as they are created
        animalList.add(new Mammal("Panda", 1869));
        animalList.add(new Mammal("Zebra", 1778));
        animalList.add(new Mammal("Koala", 1816));
        animalList.add(new Mammal("Sloth", 1804));
        animalList.add(new Mammal("Armadillo", 1758));
        animalList.add(new Mammal("Raccoon", 1758));
        animalList.add(new Mammal("Bigfoot", 2021));

        // Add in Birds as they are created
        animalList.add(new Bird("Pigeon", 1837));
        animalList.add(new Bird("Peacock", 1821));
        animalList.add(new Bird("Toucan", 1758));
        animalList.add(new Bird("Parrot", 1824));
        animalList.add(new Bird("Swan", 1758));

        // Add in Fish as they are created
        animalList.add(new Fish("Salmon", 1758));
        animalList.add(new Fish("Catfish", 1817));
        animalList.add(new Fish("Perch", 1758));

        System.out.println("\nAnimals listed by Year named(most recent to least recent):\n");
        animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
        animalList.forEach(a -> System.out.println(a));

        System.out.println("\nAnimals listed Alphabetically:\n");
        animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        animalList.forEach(a -> System.out.println(a));

        System.out.println("\nAnimals listed in order of how they move:\n");
        animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
        animalList.forEach(a -> System.out.println(a));

        System.out.println("\nAnimals listed that can breathe with lungs:\n");
        printFilteredList(animalList, a -> a.breathe() == "lungs");

        System.out.println("\nAnimals listed that breathe with lungs and were named in 1758:\n");
        printFilteredList(animalList, a -> (a.breathe() == "lungs") && (a.getYear() == 1758));

        System.out.println("\nAnimals listed that breathe with lungs and lay eggs:\n");
        printFilteredList(animalList, a -> (a.breathe() == "lungs") && (a.reproduce() == "eggs"));
        // printFilteredList(animalList, a -> a instanceof Bird); // Could also work (only Birds fit this description)

        // Last two uses require that the list be sorted alphabetically.
        // We already sorted the list, so we're already alphabetized and good to go!
        System.out.println("\nAnimals listed that were names in 1758(alphabetical):\n");
        printFilteredList(animalList, a -> a.getYear() == 1758);
        System.out.println("\nAnimals listed that are mammals(alphabetical):\n");
        printFilteredList(animalList, a -> a instanceof Mammal);
    }
}