// Last updated: 9/2/2026, 11:21:33 AM
1class Solution {
2    public int trap(int[] height) {
3        int n = height.length;
4        int[] leftMax = new int[n];
5        int[] rightMax = new int[n];
6        leftMax[0] = height[0];
7
8        for (int i = 1; i < n; i++) {
9            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
10        }
11        rightMax[n - 1] = height[n - 1];
12        for (int i = n - 2; i >= 0; i--) {
13            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
14        }
15        int total = 0;
16        for (int i = 0; i < n; i++) {
17            int water = Math.min(leftMax[i], rightMax[i]) - height[i];
18            total = total + water;
19        }
20        return total;
21    }
22}