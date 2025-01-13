package pro.shamilabd.FirstBadVersion;

public class Sol {

    public static void main(String[] args) {
        System.out.println(firstBadVersion(5, 4));
        System.out.println(firstBadVersion(1, 1));
    }

    public static int firstBadVersion(int n, int b) {
        // Перерешивал
        int l = 1;
        int r = n;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (isBadVersion(m, b)) {
                r = m - 1;
                ans = m;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }

    static boolean isBadVersion(int version, int b) {
        return version >= b;
    }
}
