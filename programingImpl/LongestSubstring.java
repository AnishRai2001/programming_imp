package programingImpl;
//nnnnnnnnnnnnnnn

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, right = 0, maxLength = 0;

        while (right < s.length()) {
            char c = s.charAt(right);

            // If duplicate character found, remove from the left side
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character and update maxLength
            set.add(c);
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("Length of longest substring: " + lengthOfLongestSubstring(s));
    }
}
