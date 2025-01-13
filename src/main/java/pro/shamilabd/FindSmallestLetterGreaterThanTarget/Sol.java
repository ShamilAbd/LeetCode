package pro.shamilabd.FindSmallestLetterGreaterThanTarget;

public class Sol {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'a'));//c
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c'));//f
        System.out.println(nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));//x
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'd'));//f
        System.out.println(nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'j'));//c
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        // Перерешивал
        int l = 0;
        int r = letters.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (letters[m] > target) {
                ans = m;
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (ans > -1) {
            return letters[ans];
        }
        return letters[0];
    }


    public static char nextGreatestLetter2(char[] letters, char target) {
        int l = 0;
        int r = letters.length - 1;
        int ans = -1;
        while (l <= r) {
            int m = (l + (r - l) / 2);
            if (target == letters[m]) {
                l = m + 1;
                ans = l;
            } else if (target < letters[m]) {
                r = m - 1;
                ans = m;
            } else if (target > letters[m]) {
                l = m + 1;
            }
        }
        if (ans != -1 && ans != letters.length) {
            return letters[ans];
        }
        return letters[0];
    }
}
