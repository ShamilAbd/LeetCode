package pro.shamilabd;

public class Test {

    public static void main(String[] args) {
        System.out.println(myPow(2.0, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2.0, -2));
        System.out.println(myPow(0.00001, 2147483647));
        System.out.println(myPow(2.0, -2147483648));
    }

    public static double myPow(double x, int n) {
        if (n == 0 || x == 1) {
            return 1;
        }
        double res = 1.0;
        long s = Math.abs((long) n);
        while (s > 0) {
            if (s % 2 == 1) {
                res *= x;
            }
            x *= x;
            s /= 2;
        }
        return n < 0 ? 1 / res : res;
    }
}