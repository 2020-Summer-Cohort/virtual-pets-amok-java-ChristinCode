package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualRoboticAnimalTest {

    @Test
    public void testOilMethod() {
        VirtualRobotAnimals underTest = new VirtualRobotAnimals("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 100);
        underTest.oil(7);
        int maintenance = underTest.getMaintenance();
        assertEquals(93, maintenance);
    }

    @Test
    public void testOilGetter() {
        VirtualRobotAnimals underTest = new VirtualRobotAnimals("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 50);
        int maintenance = underTest.getMaintenance();
        assertEquals(50, maintenance);
    }

    @Test
    public void testTick() {
        VirtualRobotAnimals underTest = new VirtualRobotAnimals("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 90);
        underTest.tick();
        assertEquals(94, underTest.getMaintenance());
    }
}