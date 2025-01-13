package pro.shamilabd.GuessNumberHigherOrLower;

public class Sol {

    public static void main(String[] args) {
        System.out.println(guessNumber(10, 6));
        System.out.println(guessNumber(100, 3));
    }

    public static int guessNumber(int n, int gus) {
        // Перерешивал
        int l = 1;
        int r = n;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int cm = guess(m, gus);
            if (cm == 0) return m;
            else if (cm > 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    static int guess(int num, int gus) {
        return Integer.compare(gus, num);
    }
}
