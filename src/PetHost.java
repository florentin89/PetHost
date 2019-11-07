import java.util.*;
import java.util.stream.Collectors;

class PetHost {

    public static void main(String[] args) {
        // Create Dogs list
        List<Dog> dogsList = new ArrayList<Dog>();

        // Create Cats list
        List<Cat> catsList = new ArrayList<Cat>();

        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("\n\nPetHost Main Menu\n");
            System.out.print("1. Add a Dog \n");
            System.out.print("2. Add a Cat \n");
            System.out.print("3. Offer a random dog for adoption \n");
            System.out.print("4. Offer a random cat for adoption\n");
            System.out.print("5. Offer multiple dogs for adoption \n");
            System.out.print("6. Offer multiple cats for adoption\n");
            System.out.print("7. Exit \n");
            choice = input.nextInt();
            String species, name;
            Integer noOfPetsToAdopt;
            Random random = new Random();
            switch (choice) {
                case 1:
                    System.out.print("Please enter a Species of dog: ");
                    species = input.next();
                    System.out.print("Please enter a Name for this dog: ");
                    name = input.next();
                    dogsList.add(new Dog(species, name));
                    System.out.print("You just added a new dog with name: " + "`" + name + "`" + " and species: " + "`" + species + "`\n");
                    break;
                case 2:
                    System.out.print("Please enter a Species of cat: ");
                    species = input.next();
                    System.out.print("Please enter a Name for this cat: ");
                    name = input.next();
                    catsList.add(new Cat(species, name));
                    System.out.print("You just added a new cat with name: " + "`" + name + "`" + " and species: " + "`" + species + "`\n");
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
                    if (dogsList.size() > 0) {
                        System.out.print("Enter the number of dogs for adoption: ");
                        noOfPetsToAdopt = input.nextInt();
                        if (noOfPetsToAdopt <= dogsList.size()) {
                            // Remove custom number of dogs from the list and keep the last ones
                            dogsList = dogsList.subList(noOfPetsToAdopt , dogsList.size());
                        } else {
                            System.out.print("You can't offer for adoption this number of dogs.\n\n");
                        }
                    } else {
                        System.out.print("You don't have any dog in your list.\n\n");
                    }
                    break;
                case 6:
                    if (catsList.size() > 0) {
                        System.out.print("Enter the number of cats for adoption: ");
                        noOfPetsToAdopt = input.nextInt();
                        if (noOfPetsToAdopt <= catsList.size()) {
                            // Remove custom number of cats from the list and keep the last ones
                            catsList = catsList.subList(noOfPetsToAdopt , catsList.size());
                        } else {
                            System.out.print("You can't offer for adoption this number of cats.\n\n");
                        }
                    } else {
                        System.out.print("You don't have any cat in your PetHost available for adoption.\n\n");
                    }
                    break;
                case 7:
                    System.out.println("Exiting PetHost...bye !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This is not a valid Option! Please select another one.");
                    break;
            }

            // Number of dogs in Pet Host
            System.out.println("\nDogs in Pet Host: " + dogsList.size());

            // Number of cats in Pet Host
            System.out.println("Cats in Pet Host: " + catsList.size());

            // Name of each Dog from the list of dogs
            System.out.println("Dogs in the list: " + String.join(", ", dogsList.stream().map(eachDog -> eachDog.getName()).collect(Collectors.toList())));

            // Name of each Cat from the list of cats
            System.out.println("Cats in the list: " + String.join(", ", catsList.stream().map(eachCat -> eachCat.getName()).collect(Collectors.toList())));
        }
    }
}
