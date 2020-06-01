package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class
VirtualPetShelterTest {
    @Test
    public void testAddPet() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        assertEquals("Salem", testShelter.returnOnePet("salem").getName());
    }

    @Test
    public void testRemovePet() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        assertEquals("Salem", testShelter.returnOnePet("salem").getName());
        testShelter.removePet("salem");
        assertEquals(false, testShelter.isAnimalInShelter("salem"));
    }

    @Test
    public void testCollection() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        assertEquals(1, testShelter.viewAnimalValues().size());
    }

    @Test
    public void testPlayOne() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.playOnePet("salem", 10);
        assertEquals(90, testShelter.returnOnePet("salem").getBoredom());
    }

    @Test
    public void testRechargeAll() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.rechargeAll(10);
        assertEquals(90, testShelter.returnOnePet("salem").getTiredness());
    }

    @Test
    public void testWater() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.waterOrganicAnimals(10);
        assertEquals(90, ((VirtualOrganicAnimals) testShelter.returnOnePet("salem")).getThirst());
    }

    @Test
    public void testFeed() {
        VirtualPet underTest = new OrganicCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100, 100, 100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.feedOrganicAnimals(10);
        assertEquals(90, ((VirtualOrganicAnimals) testShelter.returnOnePet("salem")).getHunger());
    }

    @Test
    public void testOil() {
        VirtualPet underTest = new RoboticCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100,100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.oilRoboticAnimals(10);
        assertEquals(90, ((VirtualRobotAnimals) testShelter.returnOnePet("salem")).getMaintenance());
    }
    @Test
    public void testWalk() {
        VirtualPet underTest = new RoboticDog("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100,100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.walkAllDogs();
        assertEquals(100, ((VirtualRobotAnimals) testShelter.returnOnePet("salem")).getBoredom());
    }
    @Test
    public void testTickAll() {
        VirtualPet underTest = new RoboticCat("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100,100);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.addPet(underTest);
        testShelter.tickAll();
        assertEquals(100, ((VirtualRobotAnimals) testShelter.returnOnePet("salem")).getMaintenance());
    }
}
