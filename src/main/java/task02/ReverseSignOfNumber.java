package task02;

/**
 * 02
 * With bitwise operations, change the sign of the variable from minus to plus.
 */

public class ReverseSignOfNumber {
    public static void main(String[] args) {
        ReverseSignOfNumber instance =  new ReverseSignOfNumber();

        System.out.println(instance.reverseSign(6)); // -6
        System.out.println(instance.reverseSign(-19)); // 19
        System.out.println(instance.reverseSign(0)); // 0
    }

    public int reverseSign(int number) {
        return addOne(~number);
    }

    private int addOne(int number) {
        return -(~number);
    }
}
