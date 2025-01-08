package pro.shamilabd.MedianOfTwoSortedArrays;

public class Sol {

    public static void main(String[] args) {
        var t1 = new int[]{2,2,4,4};
        var t2 = new int[]{2,2,2,4,4};
        System.out.println(findMedianSortedArrays(t1, t2));
//        var t1 = new int[]{1,3};
//        var t2 = new int[]{2};
//        System.out.println(findMedianSortedArrays(t1, t2));
//        t1 = new int[]{1,2};
//        t2 = new int[]{3, 4};
//        System.out.println(findMedianSortedArrays(t1, t2));
//        var t1 = new int[]{};
//        var t2 = new int[]{1};
//        System.out.println(findMedianSortedArrays(t1, t2));
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0 && nums2.length != 0) {
            return getMedian(nums2);
        } else if (nums2.length == 0 && nums1.length != 0) {
            return getMedian(nums1);
        } else {
            double med1 = getMedian(nums1);
            double med2 = getMedian(nums2);
            return (med1 + med2) / 2;
        }
    }

    private static double getMedian(int[] nums) {
        int l = (nums.length - 1) / 2;
        double m;
        if (nums.length % 2 == 0) {
            m = (nums[l] + nums[l + 1]) / 2.0;
        } else {
            m = nums[l];
        }
        return m;
    }
}
