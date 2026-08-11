// Last updated: 8/11/2026, 11:29:46 AM
import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int i = 0;
        int max = 0;

        for (int j = 0; j < s.length(); j++) {

            while (set.contains(s.charAt(j))) {
                set.remove(s.charAt(i));
                i++;
            }

            set.add(s.charAt(j));

            if (j - i + 1 > max) {
                max = j - i + 1;
            }
        }

        return max;
    }
}