package task04;

import task04.util.MathOperationsUtil;

/**
 * Realisation of common Euclidean Algorithm with bitwise operations
 */

public class CommonEuclideanAlgorithm {
    private MathOperationsUtil mathUtil;

    public CommonEuclideanAlgorithm() {
    }

    public CommonEuclideanAlgorithm(MathOperationsUtil mathUtil) {
        this.mathUtil = mathUtil;
    }

    public static void main(String[] args) {
        CommonEuclideanAlgorithm algorithm = new CommonEuclideanAlgorithm(new MathOperationsUtil());

        System.out.println(algorithm.findGCF(12, 8)); // 4
        System.out.println(algorithm.findGCF(13, 15)); // 1
        System.out.println(algorithm.findGCF(12, 0)); // 0
        System.out.println(algorithm.findGCF(-8, 12)); // 4
        System.out.println(algorithm.findGCF(1, 8)); // 1
    }

    public int findGCF(int a, int b) { // Greatest Common Factor
        if (a == 0 || b == 0) {
            return a == 0 ? a : b;
        }
        if(a < 0 || b < 0){
            a = a < 0 ? -(~(~a)) : a; // sign inversion
            b = b < 0 ? -(~(~b)) : b; // sign inversion
        }
        while ((a^b) != 0) { // a != b
            if (a > b) {
                a = mathUtil.subtract(a, b);
            } else {
                b = mathUtil.subtract(b, a);
            }
        }
        return a;
    }


}