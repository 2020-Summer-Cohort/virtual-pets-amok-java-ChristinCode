package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* Encapsulate all instance variables.
*Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
*include appropriate instance variable(s) to store the pets who reside at the shelter
*include methods that:
-return a Collection of all of the pets in the shelter
-return a specific VirtualPet given its name
-allow intake of a homeless pet (adding a pet to the shelter)
-allow adoption of a homeless pet (removing a pet from the shelter)
-feed all of the pets in the shelter
-water all of the pets in the shelter
-plays (or performs some other interaction(s)) with an individual pet in the shelter
*include a tick method that calls the tick method for each of the pets in the shelter, updating their needs
*introduce methods that allow for:
 -oiling/maintaining all robotic pets
 -cleaning dog cages
 *modify existing methods to only feed/water pets that are not robotic
 */
public class VirtualPetShelter {
    private Map<String, VirtualPet> shelterMap = new HashMap<>();

    public void addPet(VirtualPet animal) {
        shelterMap.put(animal.getName().toLowerCase(), animal);
    }

    public void removePet(String petName) {
        shelterMap.remove(petName);
    }

    public Collection<VirtualPet> viewAnimalValues() {
        return shelterMap.values();
    }

    public void playOnePet(String petName, int activity) {
        shelterMap.get(petName).play(activity);
    }

    public VirtualPet returnOnePet(String petName) {
        return shelterMap.get(petName);
    }

    public void rechargeAll(int nap) {
        for (VirtualPet tirednessPet : shelterMap.values()) {
            tirednessPet.recharge(nap);
        }
    }

    public void waterOrganicAnimals(int water) {
        for (VirtualPet thirstPet : shelterMap.values()) {
            if (thirstPet instanceof VirtualOrganicAnimals) {
                ((VirtualOrganicAnimals) thirstPet).drink(water);
            }
        }
    }

    public void feedOrganicAnimals(int food) {
        for (VirtualPet feedPet : shelterMap.values()) {
            if (feedPet instanceof VirtualOrganicAnimals) {
                ((VirtualOrganicAnimals) feedPet).eat(food);
            }
        }
    }

    public void cleanOrganicAnimals(int waste) {
        for (VirtualPet cleanWaste : shelterMap.values()) {
            if (cleanWaste instanceof VirtualOrganicAnimals) {
                ((VirtualOrganicAnimals) cleanWaste).cleanSoils(waste);
            }
        }
    }
    public void oilRoboticAnimals(int oilPet) {
        for (VirtualPet maintain : shelterMap.values()) {
            if (maintain instanceof VirtualRobotAnimals) {
                ((VirtualRobotAnimals) maintain).oil(oilPet);
            }
        }
    }
    public void walkAllDogs() {
        for (VirtualPet walkingDogs : shelterMap.values()) {
            if (walkingDogs instanceof WalkDogs) {
                ((WalkDogs) walkingDogs).goForWalk();
            }
        }
    }

    public void listPetName() {
        for (VirtualPet nameOfPet : shelterMap.values()) {
            System.out.println(nameOfPet.getName() + ": " + nameOfPet.getDescription());
        }
    }

    public boolean isAnimalInShelter(String petName) {
        return shelterMap.containsKey(petName);
    }

    public void tickAll() {
        for (VirtualPet tickForPet : shelterMap.values()) {
            tickForPet.tick();
        }
    }
}