package pro.shamilabd.SearchinRotatedSortedArray;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 6) == 2);//4
//        System.out.println(search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8));//4
//        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));//4
//        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2) == 6);//-1
//        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3) == -1);//-1
//        System.out.println(search(new int[]{1}, 0) == -1);//-1
//        System.out.println(search(new int[]{1, 3}, 3) == 1);//1
//        System.out.println(search(new int[]{1, 3}, 1) == 0);//0
//        System.out.println(search(new int[]{1, 2, 3}, 3) == 2);//2
//        System.out.println(search(new int[]{1, 2, 3}, 2) == 1);//1
//        System.out.println(search(new int[]{1, 2, 3}, 1) == 0);//0
//        System.out.println(search(new int[]{3, 5, 1}, 3) == 0);//0


//        System.out.println(getMinimum(new int[]{4, 5, 6, 7, 0, 1, 2})); //4
//        System.out.println(getMinimum(new int[]{4, 5, 6, 0, 1, 2, 3})); //3
//        System.out.println(getMinimum(new int[]{0, 1, 2, 3})); //0
//        System.out.println(getMinimum(new int[]{1, 2, 3, 4, 5, 6, 0})); //6
//        System.out.println(getMinimum(new int[]{4, 5, 6, 7, 8, 1, 2, 3})); //5
    }

    public static int search(int[] nums, int target) {
        int min = getMinimum(nums);
        if (target > nums[nums.length - 1]) {
            return getPosition(nums, 0, min - 1, target);
        } else {
            return getPosition(nums, min, nums.length - 1, target);
        }
    }

    private static int getPosition(int[] nums, int l, int r, int target) {
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

    private static int getMinimum(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int ans = r;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] < nums[ans]) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

}