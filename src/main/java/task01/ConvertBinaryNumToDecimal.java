package task01;

import java.util.Scanner;

/**
 * 01
 * Enter the number in binary format from the console.
 * Translate it into int and display it on the screen (“10” -> 2). Don't use util methods.
 */

public class ConvertBinaryNumToDecimal {
    public static void main(String[] args) {
        ConvertBinaryNumToDecimal instance = new ConvertBinaryNumToDecimal();
        Scanner scanner = new Scanner(System.in);
        String binaryNum;

        while (true) {
            try {
                binaryNum = scanner.nextLine();
                int decimalNum = instance.convertToDecimal(binaryNum);
                System.out.println(binaryNum + " = " + decimalNum);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public int convertToDecimal(String binaryNum) throws IllegalArgumentException {
        try {
            validateString(binaryNum);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException(ex.getMessage());
        }

        int length = binaryNum.length();
        int res = 0;
        for (int i = 0; i < length; i++) {
            if (binaryNum.charAt(i) == '1') {
                res += 1 << (binaryNum.length() - 1 - i);
            }
        }
        return res;
    }

    private void validateString(String binaryNum) throws IllegalArgumentException {
        if (binaryNum.isEmpty()) {
            throw new IllegalArgumentException("String is empty. Please input binary number");
        }
        if (binaryNum.length() > 32) {
            throw new IllegalArgumentException("String is too long. Max length is 32");
        }
        if (!isBinaryNum(binaryNum)) {
            throw new IllegalArgumentException("String is not a binary number");
        }
    }

    private boolean isBinaryNum(String binaryNum) {
        return binaryNum.chars().allMatch(x -> x == '0' || x == '1');
    }
}
