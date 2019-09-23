package task03;

import org.junit.Before;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

public class NumberOfBitsInDataTypeTest {
    private NumberOfBitsInDataType instance;
    @Mock
    private CountBitsService service;

    @Before
    public void setUp() throws Exception {
        instance = new NumberOfBitsInDataType();
        MockitoAnnotations.initMocks(CountBitsService.class);
    }
}