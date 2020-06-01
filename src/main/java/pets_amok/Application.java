package pets_amok;

import java.util.Scanner;

/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *Create a main method that…
-implements a game loop.
-asks for user input.
-writes output to the console.
-calls VirtualPetShelter's tick method after each interaction
*Available user interface actions should include (at minimum)…
-feeding all the pets
-watering all the pets
-playing with an individual pet, which should display a list of pet names and descriptions, allowing a user to select one
-allow adoption of a pet, which should display a list of pet names and descriptions, allowing a user to select one. NOTE: In the past this has been a bit confusing. Keep in mind you are playing the role of a shelter worker, if a pet is adopted it will be removed from the shelter.
-allow intake of a pet, prompting the user for the pet's information, requiring the user to (at minimum) specify name and description
 *add options to:
-walk all dogs
-clean dog cages
-oil all robotic pets
 */
public class Application {
    public static void main(String[] args) {
        int usersSelectionNumber = 1;
        String userSelectionName;
        String userSelectionDescription;

        Scanner stringInput = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);

        VirtualPet pet1 = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPet pet2 = new RoboticDog("Aspen", "It is a robot puppy with long white and grey fur and blue eyes.  V(◕ᴥ◕)V", 100, 100, 100, 100, 100);
        VirtualPet pet3 = new OrganicDog("Nina", "She is a brown and white dog who tends to bit while being held.  V(^◡^)V", 100, 100, 100, 100, 100, 100, 100);
        VirtualPet pet4 = new RoboticCat("Midnite", "It is a tiny robotic cat with black fur and buck teeth.  龴˚ᴥ˚龴", 100, 100, 100, 100, 100);

        VirtualPetShelter actualShelter = new VirtualPetShelter();
        actualShelter.addPet(pet1);
        actualShelter.addPet(pet2);
        actualShelter.addPet(pet3);
        actualShelter.addPet(pet4);

        System.out.println("Welcome to the Virtual Pet Shelter. We are excited to have your help taking care \nof our furry friends. " +
                "We will need help with feeding the animals, playing \nwith each one individually, and putting them to bed. " +
                "Below is a list of \nthe animals and their current well being status. " +
                "The well being status tracks \neach animal's hunger, boredom, and tiredness levels.\n");

        System.out.println("\t\t\t\t\t\t Well Being Levels\n" +
                "\tName:\t| Hunger Level: | Thirst Level: | Waste Level: | Maintenance Level:" +
                " | Health Risk Level: | Unhappiness Level: | Boredom Level: | Tiredness Level:\n" +
                "------------|---------------|---------------|--------------|--------------------" +
                "|--------------------|--------------------|----------------|-----------------");
        for (VirtualPet animalPets : actualShelter.viewAnimalValues()) {
            if (animalPets instanceof VirtualOrganicAnimals) {
                System.out.println(animalPets.getName() + "\t\t|\t\t" + ((VirtualOrganicAnimals) animalPets).getHunger()
                        + "\t\t|\t\t" + ((VirtualOrganicAnimals) animalPets).getThirst()
                        + "\t\t|\t\t" + ((VirtualOrganicAnimals) animalPets).getCleanliness()
                        + "\t   |\t\t\t\t\t|\t\t" + animalPets.getHealthRisk() + "\t\t\t |\t\t\t"
                        + animalPets.getUnhappy() + "\t\t  | \t" +
                        animalPets.getBoredom() + "\t\t   |\t\t" + animalPets.getTiredness());
            } else {
                System.out.println(animalPets.getName() + "\t\t|\t\t\t\t|\t\t\t\t|              |\t\t"
                        + ((VirtualRobotAnimals) animalPets).getMaintenance()
                        + "\t\t\t|\t\t" + animalPets.getHealthRisk() + "\t\t\t |\t\t\t" + animalPets.getUnhappy() + "\t\t  |\t\t" +
                        animalPets.getBoredom() + "\t\t   |\t\t" + animalPets.getTiredness());
            }
        }
        //Game Loop
        while (usersSelectionNumber != 0) {
            System.out.println("What would you like to do?\n" +
                    "Press 1 to feed organic animals\n" +
                    "Press 2 to play with an individual animal\n" +
                    "Press 3 to energize all animals\n" +
                    "Press 4 to walk all dogs\n" +
                    "Press 5 to water organic animals\n" +
                    "Press 6 to clean organic animals waste\n" +
                    "Press 7 to oil robotic animals\n" +
                    "Press 8 to sign adoption paper work\n" +
                    "Press 9 to take in a new animal\n" +
                    "Press 10 to read animal bios\n" +
                    "Press 0 to end shift and exit game");
            usersSelectionNumber = userInput.nextInt();
            if (usersSelectionNumber == 1) {
                actualShelter.feedOrganicAnimals(35);
                System.out.println("The organic animals look well fed. Thanks!");
            } else if (usersSelectionNumber == 2) {
                actualShelter.listPetName();
                System.out.println("Please type in the pets name you would like to play with:");
                userSelectionName = stringInput.nextLine().toLowerCase();
                if (actualShelter.isAnimalInShelter(userSelectionName)) {
                    actualShelter.returnOnePet(userSelectionName).play(30);
                    System.out.println(actualShelter.returnOnePet(userSelectionName).getName() + " had fun playing with you!");
                } else {
                    System.out.println("Please pick from the names provided.\n");
                }
            } else if (usersSelectionNumber == 3) {
                actualShelter.rechargeAll(40);
                System.out.println("Shhh... They are all recharging");
            } else if (usersSelectionNumber == 4) {
                actualShelter.walkAllDogs();
                System.out.println("The dogs enjoyed the walk. Thanks!");
            } else if (usersSelectionNumber == 5) {
                actualShelter.waterOrganicAnimals(30);
                System.out.println("Thanks for watering the organic animals!");
            } else if (usersSelectionNumber == 6) {
                actualShelter.cleanOrganicAnimals(55);
                System.out.println("Thanks for cleaning the dog cages and kitty litter!");
            } else if (usersSelectionNumber == 7) {
                actualShelter.oilRoboticAnimals(30);
                System.out.println("The robotic animals are moving & looking great. Thanks!");
            } else if (usersSelectionNumber == 8) {
                actualShelter.listPetName();
                System.out.println("Put in the name of the animal you are signing adoption paper work for:");
                userSelectionName = stringInput.nextLine().toLowerCase();
                if (actualShelter.isAnimalInShelter(userSelectionName)) {
                    System.out.println(actualShelter.returnOnePet(userSelectionName).getName() + " was just adopted.\n");
                    actualShelter.removePet(userSelectionName);
                } else {
                    System.out.println("Please pick from the names provided.\n");
                }
            } else if (usersSelectionNumber == 9) {
                System.out.println("Someone just found a stray. What should we name it?");
                userSelectionName = stringInput.nextLine();
                System.out.println("Please fill out the type of animal and a short description.");
                userSelectionDescription = stringInput.nextLine();
                System.out.println("Press 1 for organic cat\nPress 2 for organic dof\nPress 3 for robotic cat\nPress 4 for robotic dog");
                usersSelectionNumber = userInput.nextInt();
                VirtualPet newPet;
                if (usersSelectionNumber == 1) {
                    newPet = new OrganicCat(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100, 100, 100);
                } else if (usersSelectionNumber == 2) {
                    newPet = new OrganicDog(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100, 100, 100);
                } else if (usersSelectionNumber == 3) {
                    newPet = new RoboticCat(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100);
                } else {
                    newPet = new VirtualRobotAnimals(userSelectionName, userSelectionDescription, 100, 100, 100, 100, 100);
                }
                actualShelter.addPet(newPet);
                System.out.println("Great! " + userSelectionName + " has been added.");
            } else if (usersSelectionNumber == 10) {
                actualShelter.listPetName();
                System.out.println("Please type in the pets name you would like to learn more about.");
                userSelectionName = stringInput.nextLine();
                if (actualShelter.isAnimalInShelter(userSelectionName)) {
                    System.out.println("You chose to learn more about " + actualShelter.returnOnePet(userSelectionName).getName() + ".\n" + actualShelter.returnOnePet(userSelectionName).getDescription() + "\n");
                } else {
                    System.out.println("Please pick from the names provided.\n");
                }
            }
            if (usersSelectionNumber != 0) {
                actualShelter.tickAll();
                //     animalsWellBeings(actualShelter);
            } else {/*write good bye message*/}
        }
    }
}






