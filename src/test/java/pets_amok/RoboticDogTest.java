package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticDogTest {

    @Test
    public void testGoForWalk() {
        RoboticDog underTest = new RoboticDog("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 50);
        underTest.goForWalk();
        int oil = underTest.getMaintenance();
        assertEquals(60, oil);
    }
}
