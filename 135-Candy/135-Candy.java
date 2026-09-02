// Last updated: 9/2/2026, 10:57:48 AM
1class Solution {
2    public int candy(int[] ratings) {
3
4        int n = ratings.length;
5
6        int[] candies = new int[n];
7
8        for (int i = 0; i < n; i++) {
9            candies[i] = 1;
10        }
11
12        for (int i = 1; i < n; i++) {
13            if (ratings[i] > ratings[i - 1]) {
14                candies[i] = candies[i - 1] + 1;
15            }
16        }
17
18        for (int i = n - 2; i >= 0; i--) {
19            if (ratings[i] > ratings[i + 1]) {
20                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
21            }
22        }
23
24        int total = 0;
25
26        for (int candy : candies) {
27            total += candy;
28        }
29
30        return total;
31    }
32}