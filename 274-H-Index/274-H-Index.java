// Last updated: 9/2/2026, 11:28:29 AM
1class Solution {
2    public int hIndex(int[] citations) {
3
4        int n = citations.length;
5
6        for (int h = n; h >= 1; h--) {
7
8            int count = 0;
9
10            for (int i = 0; i < n; i++) {
11
12                if (citations[i] >= h) {
13                    count++;
14                }
15            }
16
17            if (count >= h) {
18                return h;
19            }
20        }
21
22        return 0;
23    }
24}