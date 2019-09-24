package task04.util;

public class MathOperationsUtil {
    public int subtract(int max, int min) {
        System.out.println("substract пришло: max=" + max + " min=" + min);
        while (min != 0) {
            int borrow = (~max) & min;
            max = max ^ min;
            min = borrow << 1;
        }
        System.out.println("substract вернулось: return=" + max);
        System.out.println();
        return max;
    }

    public int multiply(int a, int b) {
        System.out.println("multiply пришло: a=" + a + " b=" + b);
        int res = 0;
        int count = 0;
        while (b > 0) {
            if (b % 2 == 1) {
                res = sum(res, a << count);
            }
            count = -(~count);
            b >>= 1;
        }
        System.out.println("multiply вернулось: res=" + res);
        System.out.println();
        return res;
    }

    public int sum(int a, int b) {
        System.out.println("sum пришло: a=" + a + " b=" + b);
        if(b == 0){
            System.out.println("sum вернулось: return=" + a);
            System.out.println();
            return a;
        }else {
            int s = sum(a ^ b, (a & b) << 1);
            System.out.println("sum вернулось: return=" + s);
            System.out.println();
            return s;
        }
        //return b == 0 ? a : sum(a ^ b, (a & b) << 1);
    }
}
