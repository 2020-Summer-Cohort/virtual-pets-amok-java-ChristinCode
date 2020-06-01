package pets_amok;

/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *
 *
 */
public class RoboticCat extends VirtualRobotAnimals {
    public RoboticCat(String animalName, String animalDescription, int animalMood, int animalBoredom, int animalHealth, int animalTiredness, int maintenance) {
        super(animalName, animalDescription, animalMood, animalBoredom, animalHealth, animalTiredness, maintenance);
    }
}
