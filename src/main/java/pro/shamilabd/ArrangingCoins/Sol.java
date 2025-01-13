package pro.shamilabd.ArrangingCoins;

public class Sol {

    public static void main(String[] args) {
//        System.out.println(arrangeCoins(5));//2
//        System.out.println(arrangeCoins(8));//3
//        System.out.println(arrangeCoins(10));//4
//        System.out.println(arrangeCoins(11));//4
        System.out.println(arrangeCoins(1804289383));//60070
    }


    public static int arrangeCoins(int n) {
        if (n <= 0) {
            return 0;
        }
        int l = 1;
        int r = n;
        int ans = -1;
        while (l <= r) {
            // m - количество полных рядов
            int m = l + (r - l) / 2;
            if (enough(m, n)) {
                ans = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return ans;
    }

    private static boolean enough(int rows, int coins) {
        return rows * ((long) rows + 1) / 2 <= coins;
    }


    public static int arrangeCoins2(int n) {
        if (n == 0) {
            return 0;
        }
        int rows = 0;
        while (n > 0) {
            rows++;
            n -= rows;
        }
        if (n == 0) {
            return rows;
        }
        return --rows;
    }
}
