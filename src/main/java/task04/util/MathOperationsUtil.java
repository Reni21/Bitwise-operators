package task04.util;

public class MathOperationsUtil {
    public int subtract(int minuend, int subtrahend) {
        if(minuend == 0){
            return reverseSign(subtrahend);
        }
        while (subtrahend != 0) {
            int borrow = (~minuend) & subtrahend;
            minuend = minuend ^ subtrahend;
            subtrahend = borrow << 1;
        }
        return minuend;
    }

    public int multiply(int multiplicand, int factor) {
        if (multiplicand < 0 && factor < 0){
            multiplicand = reverseSign(multiplicand);
            factor = reverseSign(factor);
        }
        int res = 0;
        int count = 0;
        while (factor > 0) {
            if (factor % 2 == 1) {
                res = sum(res, multiplicand << count);
            }
            count = -(~count);
            factor >>= 1;
        }
        return res;
    }

    public int sum(int termOne, int termTwo) {
        return termTwo == 0 ? termOne : sum(termOne ^ termTwo, (termOne & termTwo) << 1);
    }

    private int reverseSign(int number) {
        return -(~(~number));
    }

}
