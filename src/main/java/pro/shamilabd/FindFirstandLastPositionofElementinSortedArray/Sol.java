package pro.shamilabd.FindFirstandLastPositionofElementinSortedArray;

import java.util.Arrays;

public class Sol {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8))); //3 4
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6))); //-1 -1
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0))); //-1 -1
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) return new int[] {-1, -1};
        return new int[] {leftPos(nums, target), rightPos(nums, target)};
    }

    private static int leftPos(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                r = m - 1;
                ans = m;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    private static int rightPos(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                l = m + 1;
                ans = m;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }


}
