package pets_amok;

/* Encapsulate all instance variables.
*Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
* include instance variables representing:
-name (from the above example, this might be "Tommy")
-description (from the above example, this might be "smells like a Stargazer lily fresh with morning dew")
*include a constructor that accepts a name and description
*include a constructor that, in addition to name and description, accepts default values for the pet's attributes (hunger, boredom, etc)
*Do not include a default (zero arguments) constructor.
*create a model that allows for dogs and cats, either of which may be robotic
*introduce an attribute (instance variable) representing overall health that
updated as a result of other attributes moving in a negative or positive
direction, influencing happiness
*introduce methods that allow for:
-oiling robotic pets
- walking dogs, decreasing the likelihood that organic dogs will soil their
cages, while increasing happiness in all dogs
*do not allow:
-feeding/watering robotic pets
 -oiling organic pets
 *modify the tick method to return a value indicating the amount of waste a pet
creates, which should contribute to either (optionally, create accessor methods
to retrieve these values instead):
*amount of waste in an individual dog cage
  */
public class VirtualPet {

    private String name;
    private String description;
    private int unhappy;
    private int boredom;
    private int healthRisk;
    private int tiredness;

    public VirtualPet(String name, String description, int unhappy, int boredom, int healthRisk, int tiredness) {
        this.name = name;
        this.description = description;
        this.unhappy = unhappy;
        this.boredom = boredom;
        this.healthRisk = healthRisk;
        this.tiredness = tiredness;
    }

    public void heal(int healing) {
        healthRisk -= healing;
        if (healthRisk < 0) {
            healthRisk = 0;
        }
    }

    public void happiness(int happy) {
        unhappy -= happy;
        if (unhappy < 0) {
            unhappy = 0;
        }
    }

    public void recharge(int recharging) {
        tiredness -= recharging;
        if (tiredness < 0) {
            tiredness = 0;
        } else if (tiredness > 100) {
            tiredness = 100;
        }
        unhappy -= 15;
        if (unhappy < 0) {
            unhappy = 0;
        }
        healthRisk -= 15;
        if (healthRisk < 0) {
            healthRisk = 0;
        }
        boredom += 5;
        if (boredom > 100) {
            boredom = 100;
        }
    }

    public void play(int playing) {
        boredom -= playing;
        if (boredom < 0) {
            boredom = 0;
        }
        unhappy -= 15;
        if (unhappy < 0) {
            unhappy = 0;
        }
        healthRisk -= 15;
        if (healthRisk < 0) {
            healthRisk = 0;
        }
        tiredness += 10;
        if (tiredness > 100) {
            tiredness = 100;
        }
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getUnhappy() {
        return unhappy;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHealthRisk() {
        return healthRisk;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void tick() {
        boredom += 15;
        if (boredom > 100) {
            boredom = 100;
        }
        unhappy += 10;
        if (unhappy > 100) {
            unhappy = 100;
        }
        healthRisk += 5;
        if (healthRisk > 100) {
            healthRisk = 100;
        }
        tiredness += 7;
        if (tiredness > 100) {
            tiredness = 100;
        }

    }
}
