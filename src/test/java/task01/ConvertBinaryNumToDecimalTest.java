package task01;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ConvertBinaryNumToDecimalTest {
    private ConvertBinaryNumToDecimal instance;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        instance = new ConvertBinaryNumToDecimal();
    }

    @Test
    public void shouldReturnPositiveDecimalNumberWhenValidStringLengthLessThenThirtyTwo() {
        int res = instance.convertToDecimal("11111");
        assertEquals(31, res);
    }

    @Test
    public void shouldReturnNegativeDecimalNumberWhenValidStringStartFromOneWithLengthThirtyTwo() {
        int res = instance.convertToDecimal("11111111111111111111111111110100");
        assertEquals(-12, res);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenStringIsEmpty() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("String is empty. Please input binary number");
        instance.convertToDecimal("");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenStringIsNotBinaryNumber() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("String is not a binary number");
        instance.convertToDecimal("123b");
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenStringContainMoreThanThirtyTwoSymbols() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("String is too long. Max length is 32");
        instance.convertToDecimal("111111111111111111111111111101000001111110000111110001");
    }
}
