package pro.shamilabd.SearchinRotatedSortedArray2;

public class Sol {

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2) == true);
//        System.out.println(search(new int[]{1,0,1,1,1}, 0) == true);
//        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3) == false);
//        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3) == false);
    }

    private static int getMinimum(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = r;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] <= nums[r]) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    public static boolean search(int[] nums, int target) {
        int min = getMinimum(nums);
        if (target > nums[nums.length - 1]) {
            return getPosition(nums, 0, min - 1, target);
        } else {
            return getPosition(nums, min, nums.length - 1, target);
        }
    }

    private static boolean getPosition(int[] nums, int l, int r, int target) {
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