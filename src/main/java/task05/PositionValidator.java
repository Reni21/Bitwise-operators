package task05;

public class PositionValidator {
    public void validatePosition(int bitPosition){
        if (bitPosition > 31 || bitPosition < 0) {
            throw new IllegalArgumentException("Bit position out of range 0-31.");
        }
    }
}
