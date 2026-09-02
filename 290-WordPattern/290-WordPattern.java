// Last updated: 9/2/2026, 1:42:50 PM
1import java.util.*;
2
3class Solution {
4    public boolean wordPattern(String pattern, String s) {
5
6        String[] words = s.split(" ");
7
8        if (pattern.length() != words.length) {
9            return false;
10        }
11
12        HashMap<Character, String> map1 = new HashMap<>();
13        HashMap<String, Character> map2 = new HashMap<>();
14
15        for (int i = 0; i < pattern.length(); i++) {
16
17            char ch = pattern.charAt(i);
18            String word = words[i];
19            if (map1.containsKey(ch)) {
20                if (!map1.get(ch).equals(word)) {
21                    return false;
22                }
23            }
24            if (map2.containsKey(word)) {
25                if (map2.get(word) != ch) {
26                    return false;
27                }
28            }
29            map1.put(ch, word);
30            map2.put(word, ch);
31        }
32
33        return true;
34    }
35}