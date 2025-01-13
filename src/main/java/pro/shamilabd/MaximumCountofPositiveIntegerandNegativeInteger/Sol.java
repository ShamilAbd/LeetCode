package pro.shamilabd.MaximumCountofPositiveIntegerandNegativeInteger;

public class Sol {

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-2, -1, -1, 1, 2, 3}));
        System.out.println(maximumCount(new int[]{-3, -2, -1, 0, 0, 1, 2}));
        System.out.println(maximumCount(new int[]{5, 20, 66, 1314}));
    }

    public static int maximumCount(int[] nums) {
        int lLen = negativeLength(nums);
        int rLen = positiveLength(nums);
        return Math.max(lLen, rLen);
    }

    private static int negativeLength(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= 0) {
                r = m - 1;
            } else {
                l = m + 1;
                ans = m;
            }
        }
        if (ans > -1) {
            return ans + 1;
        }
        return 0;
    }

    private static int positiveLength(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= 0) {
                l = m + 1;
            } else {
                ans = m;
                r = m - 1;
            }
        }
        if (ans > -1) {
            return nums.length - ans;
        }
        return 0;
    }


}
