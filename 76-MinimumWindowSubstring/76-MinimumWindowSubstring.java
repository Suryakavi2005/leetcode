// Last updated: 9/2/2026, 12:39:11 PM
1class Solution {
2    public String minWindow(String s, String t) {
3
4        int[] need = new int[128];
5        for (int i = 0; i < t.length(); i++) {
6            need[t.charAt(i)]++;
7        }
8
9        int left = 0;
10        int right = 0;
11
12        int count = 0;
13
14        int minLength = Integer.MAX_VALUE;
15        int start = 0;
16
17        while (right < s.length()) {
18
19            char ch = s.charAt(right);
20            if (need[ch] > 0) {
21                count++;
22            }
23
24            need[ch]--;
25            right++;
26            while (count == t.length()) {
27                if (right - left < minLength) {
28                    minLength = right - left;
29                    start = left;
30                }
31
32                char leftChar = s.charAt(left);
33
34                need[leftChar]++;
35                if (need[leftChar] > 0) {
36                    count--;
37                }
38
39                left++;
40            }
41        }
42
43        if (minLength == Integer.MAX_VALUE) {
44            return "";
45        }
46
47        return s.substring(start, start + minLength);
48    }
49}