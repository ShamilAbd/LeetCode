package pro.shamilabd.FindMinimumInRotatedSortedArray;

public class Sol {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));//1
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));//0
        System.out.println(findMin(new int[]{11,13,15,17}));//11
    }

    public static int findMin(int[] nums) {
        int med;
        int l = 0;
        int r = nums.length - 1;
        int min = nums[l];

        return min;
    }

}
