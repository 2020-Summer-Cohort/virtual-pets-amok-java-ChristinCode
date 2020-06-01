package pets_amok;

/* Encapsulate all instance variables.
 *Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
 *Robotic pets only lose health if they're not oiled regularly
 *
 */
public class VirtualRobotAnimals extends VirtualPet {
    //Fields
    protected int maintenance;

    //Constructor
    public VirtualRobotAnimals(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness, int maintenance) {
        super(name, description, unhappy, boredom, healthRisk, tiredness);
        this.maintenance = maintenance;
    }

    //Update Methods
    public void oil(int oiling) {
        maintenance -= oiling;
        if (maintenance < 0) {
            maintenance = 0;
        } else if (maintenance > 100) {
            maintenance = 100;
        }
        CallFieldsFromVP();
    }

    //Getters
    public int getMaintenance() {
        return maintenance;
    }

    //tick
    @Override
    public void tick() {
        super.tick();
        maintenance += 4;
        if (maintenance > 100) {
            maintenance = 100;
        }

    }

    private void CallFieldsFromVP() {
        happiness(15);
        heal(15);
        play(-5);
        recharge(-10);
    }
}
