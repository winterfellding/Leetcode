package me.winterfall.array;


/**
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-easy/1/array/27/
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length - 1] + 1;
        digits[digits.length - 1] = lastDigit % 10;
        int numFromLowDigits = lastDigit / 10;
        if (digits.length > 1) {
            for (int i = digits.length - 2; i >= 0; i--) {
                int tempDigit = numFromLowDigits + digits[i];
                digits[i] = tempDigit % 10;
                numFromLowDigits = tempDigit / 10;
            }
        }
        if (numFromLowDigits > 0) {
            int[] result = new int[digits.length + 1];
            result[0] = numFromLowDigits;
            for (int i = 1; i < result.length; i++) {
                result[i] = digits[i - 1];
            }
            return result;
        }
        return digits;
    }

}
