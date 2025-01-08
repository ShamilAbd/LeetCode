package pro.shamilabd.ValidPerfectSquare;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(isPerfectSquare(16));
//        System.out.println(isPerfectSquare(14));
//        System.out.println(isPerfectSquare(9));
        System.out.println(isPerfectSquare(808201));//899
    }

    public static boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        int l = 2;
        int r = num / 2;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long t = (long) m * m;
            if (t == num) return true;
            else if (t > num) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return false;
    }
}
