package pro.shamilabd.ArrangingCoins;

public class Sol {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));//2
        System.out.println(arrangeCoins(8));//3
        System.out.println(arrangeCoins(10));//4
        System.out.println(arrangeCoins(11));//4
    }


    public static int arrangeCoins(int n) {
        if (n == 0) return 0;
        int rows = 0;
        while (n > 0) {
            rows++;
            n -= rows;
        }
        if (n == 0) return rows;
        return --rows;
    }
}
