package pro.shamilabd.PlusOne;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
    }

    public static int[] plusOne(int[] digits) {
        int sum = digits[digits.length - 1] + 1;
        if (sum < 10) {
            digits[digits.length - 1] += 1;
            return digits;
        }
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] > 9 && i > 0) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
            if (digits[i] > 9 && i == 0) {
                digits[i] = 0;
                var t = new int[digits.length + 1];
                int k = 1;
                t[0] = 1;
                for (var e : digits) {
                    t[k++] = e;
                }
                return t;
            }
        }
        return digits;
    }
}
