package pro.shamilabd.TwoSum2InputArrayIsSorted;

import java.util.Arrays;

public class Sol {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{-1,-1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}, -2))); //[1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{12,13,23,28,43,44,59,60,61,68,70,86,88,92,124,125,136,168,173,173,180,199,212,
                        221,227,230,277,282,306,314,316,
                        321,325,328,336,337,363,365,368,370,370,371,375,384,387,394,400,404,414,422,422,427,430,435,457,493,506,527,531,538,541,546,568,583,585,587,650,652,677,691,730,737,740,751,755,764,778,783,785,789,794,803,809,815,847,858,863,863,874,887,896,916,920,926,927,930,933,957,981,997},
                542))); //[24,32]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9))); //[1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6))); //[1,3]
        System.out.println(Arrays.toString(twoSum(new int[]{-1, 0}, -1))); //[1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{0, 0, 3, 4}, 0))); //[1,2]
        System.out.println(Arrays.toString(twoSum(new int[]{-5, -3, 0, 2, 4, 6, 8}, 5))); //[2,7]
    }

    public static int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int maxLessThanTarget = getMaxPosInit(numbers, target, l, r);
        while (maxLessThanTarget >= 0) {
            int firstNum = target - numbers[maxLessThanTarget];
            int secondNum = target - firstNum;
            int n1 = getMaxPos(numbers, firstNum, l, r, -1) + 1;
            int n2 = getMaxPos(numbers, secondNum, l, r, n1) + 1;
            if (n1 == 0 || n2 == 0) {
                maxLessThanTarget--;
                continue;
            }
            return new int[]{Math.min(n1, n2), Math.max(n1, n2)};
        }
        return null;
    }

    private static int getMaxPosInit(int[] numbers, int target, int l, int r) {
        int ans = 0;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (numbers[m] == target) {
                return m;
            } else if (numbers[m] > target) {
                r = m - 1;
            } else {
                ans = m;
                l = m + 1;
            }
        }
        return ans;
    }

    private static int getMaxPos(int[] numbers, int target, int l, int r, int excludeIndex) {
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (numbers[m] == target && m != excludeIndex) {
                return m;
            } else if (numbers[m] == target && m == excludeIndex) {
                if (numbers[m + 1] > target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (numbers[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
