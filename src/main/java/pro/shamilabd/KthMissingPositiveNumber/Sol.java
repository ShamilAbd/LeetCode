package pro.shamilabd.KthMissingPositiveNumber;

public class Sol {

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{2, 3, 4, 7, 11}, 5));//9
        System.out.println(findKthPositive(new int[]{1, 2, 3, 4}, 2));//6
    }

    public static int findKthPositive(int[] arr, int k) {
        int skipped = 0;
        int ord = 1;
        for (int i = 0; i < arr.length; i++, ord++) {
            while (ord != arr[i]) {
                skipped++;
                if (skipped == k) {
                    return ord;
                }
                ord++;
            }
        }
        while (skipped != k) {
            skipped++;
            if (skipped == k) {
                return ord;
            }
            ord++;
        }
        return -1;
    }
}
