// Last updated: 9/2/2026, 11:07:49 AM
1class Solution {
2    public int removeDuplicates(int[] nums) {
3
4        if (nums.length <= 2) {
5            return nums.length;
6        }
7
8        int k = 2;
9
10        for (int i = 2; i < nums.length; i++) {
11
12            if (nums[i] != nums[k - 2]) {
13                nums[k] = nums[i];
14                k++;
15            }
16        }
17
18        return k;
19    }
20}