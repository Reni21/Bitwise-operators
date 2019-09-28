package task05;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ReverseSpecificBitTest {
    @Mock
    private PositionValidator validator;
    @InjectMocks
    private ReverseSpecificBit instance;

    @Before
    public void setUp() throws Exception {
        this.instance = new ReverseSpecificBit(validator);
    }

    @Test
    public void shouldCorrectlyReversBitOnGivenPosition(){
        doNothing().when(validator).validatePosition(anyInt());
        int res = instance.reverseBit(5, 3);
        assertEquals(13,res);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenGivenPositionIsBiggerThanThirtyOne(){
        doThrow(new IllegalArgumentException()).when(validator).validatePosition(33);
        instance.reverseBit(5, 33);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenGivenPositionLessThanZero(){
        doThrow(new IllegalArgumentException()).when(validator).validatePosition(-2);
        instance.reverseBit(5, -2);
    }
}
