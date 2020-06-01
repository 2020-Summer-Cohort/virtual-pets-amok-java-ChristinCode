package pets_amok;
/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *
 *
 */

public class OrganicCat extends VirtualOrganicAnimals {

    public OrganicCat(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness, int cleanliness, int hunger, int thirst) {
        super(name, description, unhappy, boredom, healthRisk, tiredness, cleanliness, hunger, thirst);
    }

}
