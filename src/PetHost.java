import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class PetHost {

    public static void main(String[] args) {
        // Create Dogs list
        List<Dog> dogsList = new ArrayList<Dog>();

        // Create Cats list
        List<Cat> catsList = new ArrayList<Cat>();

        Scanner input = new Scanner(System.in);
        int choice;
        while(true) {
            System.out.println("\n\nPetHost Main Menu\n");
            System.out.print("1. Add a Dog \n");
            System.out.print("2. Add a Cat \n");
            System.out.print("3. Offer a dog for adoption \n");
            System.out.print("4. Offer a cat for adoption\n");
            System.out.print("5. Exit \n");
            choice = input.nextInt();
            String species, name;
            Random random = new Random();
            switch(choice) {
                case 1:
                    System.out.print("Please enter a species of Dog: ");
                    species = input.next();
                    System.out.print("Please enter a name for this Dog: ");
                    name = input.next();
                    dogsList.add(new Dog(species,name));
                    System.out.print("You just added a new dog with name: " + "`"+ name + "`" + " and species: " + "`"+ species + "`\n");
                    break;
                case 2:
                    System.out.print("Please enter a species of Cat: ");
                    species = input.next();
                    System.out.print("Please enter a name for this Cat: ");
                    name = input.next();
                    catsList.add(new Cat(species,name));
                    System.out.print("You just added a new cat with name: " + "`"+ name + "`" + " and species: " + "`"+ species + "`\n");
                    break;
                case 3:
                    if (dogsList.size() > 0) {
                    System.out.print("Great news ! Someone just adopted a dog !");
                    // Remove a random dog from the list
                    int randomDog = random.nextInt(dogsList.size());
                    dogsList.remove(randomDog);
                    } else {
                        System.out.print("You don't have any dog in your PetHost available for adoption.\n\n");
                    }
                    break;
                case 4:
                    if (catsList.size() > 0) {
                        System.out.print("Great news ! Someone just adopted a cat !");
                    // Remove a random cat from the list
                    int randomCat = random.nextInt(catsList.size());
                    dogsList.remove(randomCat);
                    } else {
                        System.out.print("You don't have any cat in your PetHost available for adoption.\n\n");
                    }
                    break;
                case 5:
                    System.out.println("Exiting PetHost...bye !");
                    System.exit(0);
                    break;
                default :
                    System.out.println("This is not a valid Option! Please select another one.");
                    break;
            }

            // Number of dogs in Pet Host
            System.out.println("\nDogs in Pet Host: " + dogsList.size());

            // Number of cats in Pet Host
            System.out.println("Cats in Pet Host: " + catsList.size());

            // Name of each Dog from the list of dogs
            for (Dog eachDog: dogsList) {
                System.out.println("Name of each dog from list: " + eachDog.getName());
            }

            // Name of each Cat from the list of cats
            for (Cat eachCat: catsList) {
                System.out.println("Name of each cat from list: " + eachCat.getName());
            }
        }
    }
}
