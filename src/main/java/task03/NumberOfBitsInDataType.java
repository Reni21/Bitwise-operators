package task03;

/**
 * 03
 * Using bitwise operations, count the number of occupied bits for byte, short, int, long.
 */
public class NumberOfBitsInDataType {
    private CountBitsService service;

    public NumberOfBitsInDataType(CountBitsService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        NumberOfBitsInDataType instance = new NumberOfBitsInDataType(new CountBitsService());

        System.out.println("long use " + instance.countBitsInDataType(255L) + " bits"); // 64
        System.out.println("byte use " + instance.countBitsInDataType((byte) 2) + " bits"); // 8
    }

    public int countBitsInDataType(Number number) {
        int bitsInNumber;
        if (number instanceof Long) {
            bitsInNumber = this.service.countBitsInPositiveNumber(Long.MAX_VALUE);
            return -(~bitsInNumber);
        }
        if (number instanceof Integer) {
            bitsInNumber = this.service.countBitsInPositiveNumber(Integer.MAX_VALUE);
            return -(~bitsInNumber);
        }
        if (number instanceof Short) {
            bitsInNumber = this.service.countBitsInPositiveNumber(Short.MAX_VALUE);
            return -(~bitsInNumber);
        }
        if (number instanceof Byte) {
            bitsInNumber = this.service.countBitsInPositiveNumber(Byte.MAX_VALUE);
            return -(~bitsInNumber);
        }
        throw new IllegalArgumentException("Incorrect number format. Number shouldn't be fractional type");
    }
}
