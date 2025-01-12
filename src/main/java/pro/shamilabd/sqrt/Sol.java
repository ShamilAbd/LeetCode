package pro.shamilabd.sqrt;

public class Sol {

    public static void main(String[] args) {
        System.out.println(mySqrt(9));//3
        System.out.println(mySqrt(4));//2
        System.out.println(mySqrt(8));//2
        System.out.println(mySqrt(5));//2
        System.out.println(mySqrt(2147395599));//46339
    }


    public static int mySqrt(int x) {
        if (x < 2) return x;
        int l = 0;
        int r = x;
        int m;
        int ans = -1;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (m * m == x) {
                return m;
            } else if ((long) m * m < (long) x) {
                l = m + 1;
                ans = m;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }


//    public static int mySqrt(int x) {
//        if (x < 2) return x;
//        long l = 0;
//        long r = x;
//        long m;
//        while (l < r) {
//            m = l + (r - l) / 2;
//            if (m * m == x || m == l) {
//                return (int) m;
//            } else if (m * m < x) {
//                l = m;
//            } else if (m * m > x) {
//                r = m;
//            }
//        }
//        return (int) l;
//    }
}
