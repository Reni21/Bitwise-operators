package task02;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseSignOfNumberTest {
    private ReverseSignOfNumber instance;

    @Before
    public void setUp() throws Exception {
        instance = new ReverseSignOfNumber();
    }

    @Test
    public void shouldReturnNegativeNumberWhenArgumentPositive() {
        assertEquals(-7, instance.reverseSign(7));
    }

    @Test
    public void shouldReturnPositiveNumberWhenArgumentNegative() {
        assertEquals(13, instance.reverseSign(-13));
    }
}