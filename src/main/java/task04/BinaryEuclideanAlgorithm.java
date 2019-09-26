package task04;

import task04.util.MathOperationsUtil;

/**
 * Realisation of binary Euclidean Algorithm with bitwise operations
 */
public class BinaryEuclideanAlgorithm {
    private MathOperationsUtil mathUtil;

    public BinaryEuclideanAlgorithm(MathOperationsUtil mathUtil) {
        this.mathUtil = mathUtil;
    }

    public static void main(String[] args) {
        BinaryEuclideanAlgorithm algorithm = new BinaryEuclideanAlgorithm(new MathOperationsUtil());

        System.out.println(algorithm.findGCF(12, 8)); // 4
        System.out.println(algorithm.findGCF(13, 15)); // 1
        System.out.println(algorithm.findGCF(0, 8)); // 0
        System.out.println(algorithm.findGCF(12, -8)); // 4
        System.out.println(algorithm.findGCF(8, 1)); // 1
    }

    public int findGCF(int a, int b) { // Greatest Common Factor
        if (a == 0 || b == 0) {
            return a == 0 ? a : b;
        }
        if (a < 0 || b < 0) {
            a = a < 0 ? -(~(~a)) : a; // sign inversion
            b = b < 0 ? -(~(~b)) : b;
        }

        int temp = 1;
        while ((a ^ b) != 0) {
            if ((a & 1) == 0) { // а - even
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
                    a = mathUtil.subtract(a, b) >> 1;
                } else {
                    b = mathUtil.subtract(b, a) >> 1;
                }
            }
        }
        return a == 0 ? mathUtil.multiply(temp, b) : mathUtil.multiply(temp, a);
    }

}