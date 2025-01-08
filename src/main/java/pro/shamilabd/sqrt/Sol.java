package pro.shamilabd.sqrt;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(mySqrt(9));//3
//        System.out.println(mySqrt(4));//2
//        System.out.println(mySqrt(8));//2
//        System.out.println(mySqrt(5));//2
        System.out.println(mySqrt(2147395599));//46339
    }


    public static int mySqrt(int x) {
        if (x < 2) return x;
        long l = 0;
        long r = x;
        long m;
        while (l < r) {
            m = l + (r - l) / 2;
            if (m * m == x || m == l) {
                return (int) m;
            } else if (m * m < x) {
                l = m;
            } else if (m * m > x) {
                r = m;
            }
        }
        return (int) l;
    }
}
