package task05;

import org.junit.Before;
import org.junit.Test;

public class PositionValidatorTest {
    private PositionValidator instance;

    @Before
    public  void setUp(){
        this.instance = new PositionValidator();
    }

    @Test
    public void shouldNotThrowExceptionWhenPositionInRangeFromOneToThirtyOne(){
        instance.validatePosition(3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenPositionBiggerThenThirtyOne(){
        instance.validatePosition(33);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenPositionLessThenZero(){
        instance.validatePosition(-3);
    }
}
