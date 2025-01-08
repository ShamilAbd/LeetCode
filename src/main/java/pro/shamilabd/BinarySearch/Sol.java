package pro.shamilabd.BinarySearch;

public class Sol {

    public static void main(String[] args) {
        System.out.println(search(new int[]{2,3,4,5,6}, 5));
        System.out.println(search(new int[]{2,3,4,5,6}, 6));
        System.out.println(search(new int[]{2,3,4,5,6}, 2));
        System.out.println(search(new int[]{2,3,4,5,6}, 1));
    }

    public static int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] > target) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
