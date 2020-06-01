package pets_amok;

/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *Organic pets have their health decreased by unclean circumstances, and by thirst or hunger growing too high.
 *
 */
public class VirtualOrganicAnimals extends VirtualPet {
    //Fields
    protected int cleanliness;
    protected int hunger;
    protected int thirst;

    //Constructor
    public VirtualOrganicAnimals(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness, int cleanliness, int hunger, int thirst) {
        super(name, description, unhappy, boredom, healthRisk, tiredness);
        this.cleanliness = cleanliness;
        this.hunger = hunger;
        this.thirst = thirst;
    }

    //Update Methods
    public void eat(int feed) {
        hunger -= feed;
        if (hunger < 0) {
            hunger = 0;
        } else if (hunger > 100) {
            hunger = 100;
        }
        CallFieldsFromVP();
    }

    public void drink(int drink) {
        thirst -= drink;
        if (thirst < 0) {
            thirst = 0;
        } else if (thirst > 100) {
            thirst = 100;
        }
        CallFieldsFromVP();
    }

    public void cleanSoils(int clean) {
        cleanliness -= clean;
        if (cleanliness < 0) {
            cleanliness = 0;
        } else if (cleanliness > 100) {
            cleanliness = 100;
        }
        CallFieldsFromVP();
    }

    //Getters
    public int getCleanliness() {
        return cleanliness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }


    //Tick
    @Override
    public void tick() {
        super.tick();
        hunger += 2;
        if (hunger > 100) {
            hunger = 100;
        }
        thirst += 2;
        if (thirst > 100) {
            thirst = 100;
        }
        cleanliness += 3;
        if (cleanliness > 100) {
            cleanliness = 100;
        }
    }

    private void CallFieldsFromVP() {
        happiness(15);
        heal(15);
        play(-5);
        recharge(-10);
    }
}
