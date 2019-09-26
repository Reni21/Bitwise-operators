package task04;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import task04.util.MathOperationsUtil;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class BinaryEuclideanAlgorithmTest {
    @Mock
    private MathOperationsUtil util;
    @InjectMocks
    private BinaryEuclideanAlgorithm instance;

    @Before
    public void setUp() throws Exception {
        this.instance = new BinaryEuclideanAlgorithm(this.util);
    }

    @Test
    public void shouldFindGreatestCommonFactorForAnyIntegerNumber() {
        when(util.subtract(65, 39)).thenReturn(26);
        when(util.subtract(39, 13)).thenReturn(26);
        when(util.multiply(1, 13)).thenReturn(13);

        int res = instance.findGCF(39, -65);
        assertEquals(13, res);
    }

    @Test
    public void shouldReturnOneWhenArgumentHaveNotAnyGreatestCommonFactor() {
        when(util.subtract(15, 13)).thenReturn(2);
        when(util.subtract(13, 1)).thenReturn(12);
        when(util.subtract(3, 1)).thenReturn(2);
        when(util.multiply(1, 1)).thenReturn(1);

        int res = instance.findGCF(13, 15);
        assertEquals(1, res);
    }

    @Test
    public void shouldReturnZeroWhenAnyOfArgumentsIsZero() {
        int res = instance.findGCF(0, 65);
        assertEquals(0, res);
    }
}
