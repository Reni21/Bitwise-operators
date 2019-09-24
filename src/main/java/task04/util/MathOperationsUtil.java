package task04.util;

public class MathOperationsUtil {
    public int subtract(int max, int min) {
        while (min != 0) {
            int borrow = (~max) & min;
            max = max ^ min;
            min = borrow << 1;
        }
        return max;
    }

    public int multiply(int a, int b) {
        int res = 0;
        int count = 0;
        while (b > 0) {
            if (b % 2 == 1) {
                res = sum(res, a << count);
            }
            count = -(~count);
            b >>= 1;
        }
        return res;
    }

    public int sum(int a, int b) {
        return b == 0 ? a : sum(a ^ b, (a & b) << 1);
    }
}
