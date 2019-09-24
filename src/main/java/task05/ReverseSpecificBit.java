package task05;

/**
 * 5
 * Using bitwise operations, change the bit with the number pos in the variable of type int to one, to 0.
 */
public class ReverseSpecificBit {
    private PositionValidator validator;

    public ReverseSpecificBit(PositionValidator validator) {
        this.validator = validator;
    }

    public static void main(String[] args) {
        ReverseSpecificBit reverser = new ReverseSpecificBit(new PositionValidator());

        try {
            int number = 5;
            int bitPosition = 3;
            System.out.println("Before replacement: " + Integer.toBinaryString(number)); // 101
            number = reverser.reverseBit(number, bitPosition);
            System.out.println("After replacement: " + Integer.toBinaryString(number)); // 1101
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int reverseBit(int number, int bitPosition) {
        validator.validatePosition(bitPosition);
        return number ^ (1 << bitPosition);
    }
}
