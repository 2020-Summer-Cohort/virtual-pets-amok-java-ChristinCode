package pets_amok;

/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *
 *
 */
public class OrganicDog extends VirtualOrganicAnimals implements WalkDogs {

    public OrganicDog(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness, int cleanliness, int hunger, int thirst) {
        super(name, description, unhappy, boredom, healthRisk, tiredness, cleanliness, hunger, thirst);
    }

    @Override
    public void goForWalk() {
        cleanSoils(15);
        drink(-20);
        eat(-20);
        happiness(10);
        heal(10);
        play(5);
        recharge(-10);
    }
}
