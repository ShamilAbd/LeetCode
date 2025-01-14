package pro.shamilabd.FindPeakElement;

public class Sol {

    public static void main(String[] args) {
        System.out.println(findPeakElement(new int[]{1, 2, 3, 1})); //2
        System.out.println(findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4})); //5
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums.length == 2) return nums[0] > nums[1] ? 0 : 1;
        int l = 0;
        int r = nums.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (m > 0 && m < nums.length - 1) {
                if (nums[m - 1] < nums[m] && nums[m + 1] < nums[m]) {
                    l = m + 1;
                    ans = m;
                } else if (nums[m + 1] > nums[m]) {
                    l = m + 1;
                    ans = l;
                } else if (nums[m - 1] > nums[m]) {
                    r = m - 1;
                }
            } else if (m == 0) {
                if (nums[m + 1] > nums[m]) {
                    l = m + 1;
                } else {
                    return m;
                }
            } else {
                if (nums[m - 1] < nums[m]) {
                    if (nums[ans] > nums[m]) {
                        return ans;
                    } else {
                        return m;
                    }
                } else {
                    if (nums[ans] > nums[m]) {
                        return ans;
                    } else {
                        return m;
                    }
                }
            }
        }
        return ans;
    }
}
