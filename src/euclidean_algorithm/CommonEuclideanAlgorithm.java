package euclidean_algorithm;

/**
 * Realisation of common Euclidean Algorithm with bitwise operations
 */

public class CommonEuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println(findGCF(12, 8)); // 4
        System.out.println(findGCF(13, 15)); // 1
        System.out.println(findGCF(12, 0)); // 0
        System.out.println(findGCF(-8, 12)); // 4
        System.out.println(findGCF(1, 8)); // 1
    }

    static int findGCF(int a, int b) { // Greatest Common Factor
        if (a == 0 || b == 0) {
            return a == 0 ? a : b;
        }
        if(a < 0 || b < 0){
            a = a < 0 ? -(~(~a)) : a; // sign inversion
            b = b < 0 ? -(~(~b)) : b; // sign inversion
        }
        while ((a^b) != 0) { // a != b
            if (a > b) {
                a = subtract(a, b);
            } else {
                b = subtract(b, a);
            }
        }
        return a;
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