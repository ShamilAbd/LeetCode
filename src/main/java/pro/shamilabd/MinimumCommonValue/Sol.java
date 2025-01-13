package pro.shamilabd.MinimumCommonValue;

public class Sol {

    public static void main(String[] args) {
        System.out.println(getCommon(new int[]{1,2,3}, new int[]{2,4}));
        System.out.println(getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }

    public static int getCommon(int[] nums1, int[] nums2) {
        for (int i : nums1) {
            if (isContain(nums2, i)) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isContain(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return true;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
