package pro.shamilabd.LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb")); // 3
        System.out.println(lengthOfLongestSubstring("bbbbb")); // 1
        System.out.println(lengthOfLongestSubstring("pwwkew")); // 3
//        System.out.println(lengthOfLongestSubstring("")); //
//        System.out.println(lengthOfLongestSubstring("")); //
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        Set<Character> chars = new HashSet<>();
        int head = 0;
        int tail = 0;
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            char cr = s.charAt(i);
            head = i;
            if (!chars.contains(cr)) {
                tail = head + 1;
                chars.add(cr);
                for (int j = head + 1; j < s.length(); j++) {
                    char chT = s.charAt(j);
                    if (!chars.contains(chT)) {
                        tail++;
                        chars.add(cr);
                    } else {
                        break;
                    }
                    maxLength = Math.max(tail - head, maxLength);
                }
            }
        }
        return maxLength;
    }
}
