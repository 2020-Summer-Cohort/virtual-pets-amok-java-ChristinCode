package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    @Test
    public void testHealthMethod() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 10, 100);
        underTest.heal(10);
        int health = underTest.getHealthRisk();
        assertEquals(0, health);
    }

    @Test
    public void testHappinessMethod() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100);
        underTest.happiness(5);
        int mood = underTest.getUnhappy();
        assertEquals(95, mood);
    }

    @Test
    public void testSleepEnergizeBodyMethod() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100);
        underTest.recharge(8);
        int tiredness = underTest.getTiredness();
        assertEquals(92, tiredness);
    }

    @Test
    public void testPlayMethod() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100);
        underTest.play(7);
        int boredom = underTest.getBoredom();
        assertEquals(93, boredom);
    }

    @Test
    public void testNameGetter() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100);
        String name = underTest.getName();
        assertEquals("Salem", name);
    }

    @Test
    public void testDescriptionGetter() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100);
        String description = underTest.getDescription();
        assertEquals("He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", description);
    }

    @Test
    public void testHappinessGetter() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 80, 100, 100, 100);
        int mood = underTest.getUnhappy();
        assertEquals(80, mood);
    }

    @Test
    public void testPlayGetter() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 50, 100, 100);
        int boredom = underTest.getBoredom();
        assertEquals(50, boredom);
    }

    @Test
    public void testHealthGetter() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100);
        int health = underTest.getHealthRisk();
        assertEquals(100, health);
    }

    @Test
    public void testSleepEnergizeBodyGetter() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 70);
        int tiredness = underTest.getTiredness();
        assertEquals(70, tiredness);
    }

    @Test
    public void testTickMethod() {
        VirtualPet underTest = new VirtualPet("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 40);
        underTest.tick();
        assertEquals(47, underTest.getTiredness());
    }
}
