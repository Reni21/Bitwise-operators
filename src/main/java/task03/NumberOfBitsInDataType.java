package task03;

/**
 * 3
 * Using bitwise operations, count the number of occupied bits for byte, short, int, long.
 */
public class NumberOfBitsInDataType {
    public static void main(String[] args) {
        System.out.println("long use " + countBitsInDataType(255L) + " bits"); // 64
        System.out.println("byte use " + countBitsInDataType((byte)2) + " bits"); // 8
        System.out.println("2 use " + countBitsInNumber(2) + " bits"); // 0b10 = 2
        System.out.println("277 use " + countBitsInNumber(277) + " bits"); // 0b100010101 = 9
    }

    private static int countBitsInNumber(long number) {
        int res = 0;
        while (number > 0) {
            res = -(~res); // increment
            number >>= 1;
        }
        return res;
    }

    private static int countBitsInDataType(Number number) {
        if (number instanceof Long){
            return -(~countBitsInNumber(Long.MAX_VALUE)); // or Long.SIZE
        }
        if (number instanceof Integer){
            return -(~countBitsInNumber(Integer.MAX_VALUE)); // or Integer.SIZE
        }
        if (number instanceof Short){
            return -(~countBitsInNumber(Short.MAX_VALUE));
        }
        if (number instanceof Byte){
            return -(~countBitsInNumber(Byte.MAX_VALUE));
        }
        return 0;
    }
}
