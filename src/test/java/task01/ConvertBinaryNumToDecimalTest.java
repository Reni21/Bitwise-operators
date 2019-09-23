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
        assertEquals(31, instance.convertToDecimal("11111"));
    }

    @Test
    public void shouldReturnNegativeDecimalNumberWhenValidStringStartFromOneWithLengthThirtyTwo() {
        assertEquals(-12, instance.convertToDecimal("11111111111111111111111111110100"));
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