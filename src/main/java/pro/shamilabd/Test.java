package pro.shamilabd;

import org.w3c.dom.xpath.XPathResult;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {


    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(9));
    }

    // Перерешивал
    public static int mySqrt(int x) {
        // Перерешивал
        int l = 0;
        int r = x;
        int a = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            long p = (long) m * m;
            if (p == x) {
                return m;
            } else if (p < x) {
                a = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return a;
    }
}
