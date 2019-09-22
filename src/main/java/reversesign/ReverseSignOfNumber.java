package reversesign;

/**
 * 2
 * Due to bitwise operations, change the sign of the variable from minus to plus.
 */

public class ReverseSignOfNumber {
    public static void main(String[] args) {
        int numOne = 6;
        int numTwo = -19;
        int numThree = 0;
        System.out.println(reverseSign(numOne)); // -6
        System.out.println(reverseSign(numTwo)); // 19
        System.out.println(reverseSign(numThree)); // 0
    }

    private static int reverseSign(int number) {
        return addOne(~number);
    }

    private static int addOne(int number) {
        return -(~number);
    }
}
