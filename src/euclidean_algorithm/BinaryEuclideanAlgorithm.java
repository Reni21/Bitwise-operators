package euclidean_algorithm;

/**
 * Realisation of binary Euclidean Algorithm with bitwise operations
 */

public class BinaryEuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println(findGCF(12, 8)); // 4
        System.out.println(findGCF(13, 15)); // 1
        System.out.println(findGCF(0, 8)); // 0
        System.out.println(findGCF(12, -8)); // 4
        System.out.println(findGCF(8, 1)); // 1
    }

    static int findGCF(int a, int b) { // Greatest Common Factor
        if (a == 0 || b == 0) {
            return a == 0 ? a : b;
        }
        if (a < 0 || b < 0) {
            a = a < 0 ? sum(~a, 1) : a; // sign inversion
            b = b < 0 ? sum(~b, 1) : b; // sign inversion
        }

        int temp = 1;
        while ((a ^ b) != 0) {
            if ((a & 1) == 0) {
                if ((b & 1) == 0) { // a - even, b - even
                    temp <<= 1;
                    a >>= 1;
                    b >>= 1;
                } else { // a - even, b - odd
                    a >>= 1;
                }
            } else if ((b & 1) == 0) { // a - odd, b - even
                b >>= 1;
            } else { // a - odd, b - odd
                if (a > b) {
                    a = subtract(a, b) >> 1;
                } else {
                    b = subtract(b, a) >> 1;
                }
            }
        }
        return a == 0 ? multiply(temp, b) : multiply(temp, a);
    }

    static int multiply(int a, int b) {
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

    static int sum(int a, int b) {
        return b == 0 ? a : sum(a ^ b, (a & b) << 1);
    }

    static int subtract(int max, int min) {
        while (min != 0) {
            int borrow = (~max) & min;
            max = max ^ min;
            min = borrow << 1;
        }
        return max;
    }
}
