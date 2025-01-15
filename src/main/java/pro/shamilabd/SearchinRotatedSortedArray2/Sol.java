package pro.shamilabd.SearchinRotatedSortedArray2;

public class Sol {

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,5,1}, 3) == true);
        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,1,1,1,1,1}, 13) == true);
        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1}, 2) == true);
//        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,1,1,1}, 1) == true);
//        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,1,1,1}, 2) == true);
//        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,1,1,1}, 3) == true);
//        System.out.println(search(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,3,4,1,1,1}, 4) == true);
//        System.out.println(search(new int[]{1,0,1,1,1}, 0) == true);
//        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3) == false);
//        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3) == false);
    }


    public static boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int m = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (nums[m] == target) {
                return true;
            } else if (nums[l] == nums[r]) {
                if (nums[l] == nums[m]) {
                    l = l + 1;
                    r = r - 1;
                } else if (nums[l] > nums[m]) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else if (nums[l] > nums[r]) {
                if (nums[m] > target) {
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            } else { // nums[l] < nums[r]
                if (nums[m] < target) {
                    l = m + 1;
                } else {
                    r = m - 1;
                }
            }
        }
        return false;
    }

}