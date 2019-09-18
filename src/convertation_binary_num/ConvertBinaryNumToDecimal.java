package convertation_binary_num;

import java.util.Scanner;

/**
 * 1
 * Enter the number in binary format from the console.
 * Translate it into int and display it on the screen (“10” -> 2). Don't use util methods.
 */

public class ConvertBinaryNumToDecimal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String binaryNum = scanner.nextLine();
            System.out.println(binaryNum + " = " + convertToDecimal(binaryNum));
        } catch (IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }

    private static int convertToDecimal(String binaryNum) {
        if (binaryNum.isEmpty() || !(isBinaryNum(binaryNum))
                || binaryNum.length() > 32) {
            throw new IllegalArgumentException("Incorrect String format");
        }

        int res = 0;
        for (int i = 0; i < binaryNum.length(); i++) {
            if (binaryNum.charAt(i) == '1') {
                res += 1 << (binaryNum.length() - 1 - i);
            }
        }
        return res;
    }

    private static boolean isBinaryNum(String binaryNum) {
       return binaryNum.chars().allMatch(x -> x == '0' || x == '1');
    }
}
