package task03;

/**
 * 03
 * Using bitwise operations, count the number of occupied bits for byte, short, int, long.
 */
public class NumberOfBitsInDataType {
    public static void main(String[] args) {
        NumberOfBitsInDataType instance = new NumberOfBitsInDataType();

        System.out.println("long use " + instance.countBitsInDataType(255L) + " bits"); // 64
        System.out.println("byte use " + instance.countBitsInDataType((byte)2) + " bits"); // 8
    }

    public int countBitsInDataType(Number number) {
        CountBitsService service = new CountBitsService();
        if (number instanceof Long){
            return -(~service.countBitsInNumber(Long.MAX_VALUE));
        }
        if (number instanceof Integer){
            return -(~service.countBitsInNumber(Integer.MAX_VALUE));
        }
        if (number instanceof Short){
            return -(~service.countBitsInNumber(Short.MAX_VALUE));
        }
        if (number instanceof Byte){
            return -(~service.countBitsInNumber(Byte.MAX_VALUE));
        }
        return 0;
    }
}
