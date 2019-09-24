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
        int res = instance.reverseSign(7);
        assertEquals(-7, res);
    }

    @Test
    public void shouldReturnPositiveNumberWhenArgumentNegative() {
        int res = instance.reverseSign(-13);
        assertEquals(13, res);
    }
}
