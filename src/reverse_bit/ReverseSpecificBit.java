package reverse_bit;

/**
 * 5
 * Using bitwise operations, change the bit with the number pos in the variable of type int to one, to 0.
 */

public class ReverseSpecificBit {
    public static void main(String[] args) {
        try {
            int number = 5;
            int bitPosition = 3;
            System.out.println("Before replacement: " + Integer.toBinaryString(number)); // 101
            number = reverseBit(number, bitPosition);
            System.out.println("After replacement: " + Integer.toBinaryString(number)); // 1101
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static int reverseBit(int number, int bitPosition) {
        if (bitPosition > 32 || bitPosition < 0) {
            throw new IllegalArgumentException("Invalid bit position number");
        }
        return number ^ (1 << bitPosition);
    }
}
