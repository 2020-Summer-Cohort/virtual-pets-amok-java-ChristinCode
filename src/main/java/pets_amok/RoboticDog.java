package pets_amok;

/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *
 *
 */
public class RoboticDog extends VirtualRobotAnimals implements WalkDogs {

    public RoboticDog(String animalName, String animalDescription, int animalMood, int animalBoredom, int animalHealth, int animalTiredness, int maintenance) {
        super(animalName, animalDescription, animalMood, animalBoredom, animalHealth, animalTiredness, maintenance);
    }

    @Override
    public void goForWalk() {
        oil(-10);
        happiness(10);
        heal(10);
        play(5);
        recharge(-10);
    }
}
