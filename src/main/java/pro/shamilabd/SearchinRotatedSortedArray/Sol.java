package pro.shamilabd.SearchinRotatedSortedArray;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 6) == 2);//4
        System.out.println(search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 8) == 4);//4
        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0) == 4);//4
//        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 2) == 6);//-1
//        System.out.println(search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3) == -1);//-1
//        System.out.println(search(new int[]{1}, 0) == -1);//-1
//        System.out.println(search(new int[]{1, 3}, 3) == 1);//1
//        System.out.println(search(new int[]{1, 3}, 1) == 0);//0
//        System.out.println(search(new int[]{1, 2, 3}, 3) == 2);//2
//        System.out.println(search(new int[]{1, 2, 3}, 2) == 1);//1
//        System.out.println(search(new int[]{1, 2, 3}, 1) == 0);//0
//        System.out.println(search(new int[]{3, 5, 1}, 3) == 0);//0
    }

    public static int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target && nums[l] > nums[r] && nums[r] < target && nums[l] < nums[m]) {
                l = m + 1;
            } else if (nums[m] > target && nums[l] > nums[r] && nums[r] > target && nums[l] < nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (l == r && nums[r] == target) {
            return r;
        }
        return ans;
    }


    public static int search2(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[l] > nums[r] && nums[r] < target) {
                if (nums[l] < target) {
                    r = m;
                } else {
                    l = m + 1;
                }
            } else {
                if (nums[l] < target) {
                    l = m + 1;
                } else {
                    r = m;
                }
            }
        }
        if (l == r && nums[l] == target) {
            return l;
        }
        return ans;
    }
}
