package task03;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class NumberOfBitsInDataTypeTest {
    @Mock
    private CountBitsService service;
    @InjectMocks
    private NumberOfBitsInDataType instance;

    @Before
    public void setUp() throws Exception {
        this.instance = new NumberOfBitsInDataType();
    }

    @Test
    public void shouldCountNumberOfBitsInAllIntegerDataTypes() {
        when(service.countBitsInPositiveNumber(Short.MAX_VALUE)).thenReturn(15);
        int res = instance.countBitsInDataType((short) 7);
        assertEquals(16, res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenNumberForArgumentIsFractional() {
        instance.countBitsInDataType(7.77);
    }
}