package pro.shamilabd.FairCandySwap;

import java.util.Arrays;

public class FairCandySwap {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,1}, new int[]{2,2})));//1,2
        System.out.println(Arrays.toString(fairCandySwap(new int[]{1,2}, new int[]{2,3})));//1,2
//        System.out.println(Arrays.toString(fairCandySwap(new int[]{2}, new int[]{1, 3})));//2,3
//        System.out.println(Arrays.toString(fairCandySwap(new int[]{}, new int[]{})));
    }

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        for(int i: aliceSizes) {
            for (int j : bobSizes) {
                if (j == i * 2) {
                    break;
                }
            }
        }

        return new int[]{1, 1};
    }
}
