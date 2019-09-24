package task03;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountBitsServiceTest {
    private CountBitsService service;

    @Before
    public void setUp() throws Exception {
        this.service = new CountBitsService();
    }

    @Test
    public void shouldReturnNumberOfBitsNeededToRepresentNumberInBinarySystem() {
        int res = service.countBitsInPositiveNumber(31);
        assertEquals(5, res);
    }

    @Test
    public void shouldReturnZeroWhenNumberForArgumentIsZero() {
        int res = service.countBitsInPositiveNumber(0);
        assertEquals(0, res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNumberIsNegative() {
        service.countBitsInPositiveNumber(-31);
    }
}
