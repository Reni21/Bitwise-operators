package task04.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathOperationsUtilTest {
    private MathOperationsUtil instance;

    @Before
    public void setUp() throws Exception {
        this.instance = new MathOperationsUtil();
    }

    @Test
    public void shouldReturnCorrectResultOfMultipleForAnyNumbers() {
        int res = instance.multiply(-2, 2);
        assertEquals(-4, res);
    }

    @Test
    public void shouldReturnZeroAsMultipleResultWhenOneOreBothArgumentsAreZero() {
        int res = instance.multiply(0, 2);
        assertEquals(0, res);
    }

    @Test
    public void shouldReturnPositiveNumberAsMultipleResultIfBothArgumentAreNegative() {
        int res = instance.multiply(-2, -2);
        assertEquals(4, res);
    }

    @Test
    public void shouldReturnCorrectResultOfSubtractForAnyNumbers() {
        int res = instance.subtract(-2, 2);
        assertEquals(-4, res);
    }

    @Test
    public void shouldReturnZeroAsResultOfSubtractIfBothArgumentAreNegativeAndTheSame() {
        int res = instance.subtract(-2, -2);
        assertEquals(0, res);
    }

    @Test
    public void shouldReturnCorrectSumForAnyNumbers() {
        int res = instance.sum(-4, 2);
        assertEquals(-2, res);
    }

}
