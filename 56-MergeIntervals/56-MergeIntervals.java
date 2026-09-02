// Last updated: 9/2/2026, 1:51:36 PM
1import java.util.*;
2
3class Solution {
4    public int[][] merge(int[][] intervals) {
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> result = new ArrayList<>();
8
9        int start = intervals[0][0];
10        int end = intervals[0][1];
11
12        for (int i = 1; i < intervals.length; i++) {
13
14            if (intervals[i][0] <= end) {
15                end = Math.max(end, intervals[i][1]);
16            } else {
17                result.add(new int[]{start, end});
18
19                start = intervals[i][0];
20                end = intervals[i][1];
21            }
22        }
23
24        result.add(new int[]{start, end});
25
26        return result.toArray(new int[result.size()][]);
27    }
28}