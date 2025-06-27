import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Assertions_Test {
    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3); //checks if expected value is equal to actual value
        assertTrue(5 > 3); //checks if the given condition is true
        assertFalse(5 < 3); //checks if the given condition is true
        assertNull(null); //checks if given argument is a null object or not
        assertNotNull(new Object()); //checks if given argument is not a null object or not
    }
}
