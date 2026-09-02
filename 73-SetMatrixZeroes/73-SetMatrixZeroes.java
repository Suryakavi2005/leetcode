// Last updated: 9/2/2026, 1:49:36 PM
1class Solution {
2    public void setZeroes(int[][] matrix) {
3
4        int m = matrix.length;
5        int n = matrix[0].length;
6
7        boolean[] rows = new boolean[m];
8        boolean[] columns = new boolean[n];
9        for (int i = 0; i < m; i++) {
10            for (int j = 0; j < n; j++) {
11                if (matrix[i][j] == 0) {
12                    rows[i] = true;
13                    columns[j] = true;
14                }
15            }
16        }
17        for (int i = 0; i < m; i++) {
18
19            if (rows[i]) {
20                for (int j = 0; j < n; j++) {
21                    matrix[i][j] = 0;
22                }
23            }
24        }
25        for (int j = 0; j < n; j++) {
26
27            if (columns[j]) {
28                for (int i = 0; i < m; i++) {
29                    matrix[i][j] = 0;
30                }
31            }
32        }
33    }
34}