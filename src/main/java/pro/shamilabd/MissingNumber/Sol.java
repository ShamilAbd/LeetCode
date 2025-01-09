package pro.shamilabd.MissingNumber;

public class Sol {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));//2
        System.out.println(missingNumber(new int[]{0,1}));//2
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));//8
    }

    public static int missingNumber(int[] nums) {
        int l = nums.length;
        long fSum = 0;
        long pSum = 0;
        for (int i = 0; i < l; i++) {
            pSum += (long) i * i;
            fSum += (long) nums[i] * nums[i];
        }
        pSum += (long) l * l;
        long dif = pSum - fSum;
        return (int) Math.sqrt(dif);
    }
}
