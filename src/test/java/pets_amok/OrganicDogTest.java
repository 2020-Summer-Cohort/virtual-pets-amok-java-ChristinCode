package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {
    @Test
    public void testGoForWalk() {
        OrganicDog underTest = new OrganicDog("Salem", "He is an older, cuddly cat with black fur and green eyes.  龴ↀ◡ↀ龴", 100, 100, 100, 100, 50, 100, 100);
        underTest.goForWalk();
        int cleanliness = underTest.getCleanliness();
        assertEquals(35,cleanliness);
    }
}
