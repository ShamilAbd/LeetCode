package pro.shamilabd.SearchInsertPosition;

public class SearchInsertPosition {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));//2
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));//1
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));//4
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;
        while (left <= right) {
            int med = left + (right - left) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                left = med + 1;
            } else if (nums[med] > target) {
                result = med;
                right = med - 1;
            }
        }
        return result;
    }









    public static int searchInsert2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = nums.length;
        while (left <= right) {
            int med = left + (right - left) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] < target) {
                left = med + 1;
            } else if (nums[med] > target) {
                result = med;
                right = med - 1;
            }
        }
        return result;
    }


}
