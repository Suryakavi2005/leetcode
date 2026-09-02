// Last updated: 9/2/2026, 2:01:02 PM
1import java.util.*;
2
3class Solution {
4    public int[][] insert(int[][] intervals, int[] newInterval) {
5        List<int[]> result = new ArrayList<>();
6
7        int i = 0;
8        int start = newInterval[0];
9        int end = newInterval[1];
10
11        while (i < intervals.length && intervals[i][1] < start) {
12            result.add(intervals[i]);
13            i++;
14        }
15
16        while (i < intervals.length && intervals[i][0] <= end) {
17            start = Math.min(start, intervals[i][0]);
18            end = Math.max(end, intervals[i][1]);
19            i++;
20        }
21
22        result.add(new int[]{start, end});
23
24        while (i < intervals.length) {
25            result.add(intervals[i]);
26            i++;
27        }
28
29        return result.toArray(new int[result.size()][]);
30    }
31}