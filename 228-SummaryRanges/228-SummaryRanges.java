// Last updated: 9/2/2026, 1:50:43 PM
1import java.util.*;
2
3class Solution {
4    public List<String> summaryRanges(int[] nums) {
5        List<String> result = new ArrayList<>();
6
7        int i = 0;
8
9        while (i < nums.length) {
10            int start = nums[i];
11
12            while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
13                i++;
14            }
15
16            int end = nums[i];
17
18            if (start == end) {
19                result.add(String.valueOf(start));
20            } else {
21                result.add(start + "->" + end);
22            }
23
24            i++;
25        }
26
27        return result;
28    }
29}