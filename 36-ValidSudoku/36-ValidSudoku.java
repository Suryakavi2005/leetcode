// Last updated: 9/2/2026, 12:25:47 PM
1class Solution {
2    public boolean isValidSudoku(char[][] board) {
3
4        boolean[][] rows = new boolean[9][9];
5        boolean[][] cols = new boolean[9][9];
6        boolean[][] boxes = new boolean[9][9];
7
8        for (int i = 0; i < 9; i++) {
9
10            for (int j = 0; j < 9; j++) {
11
12                if (board[i][j] == '.') {
13                    continue;
14                }
15
16                int num = board[i][j] - '1';
17
18                int box = (i / 3) * 3 + (j / 3);
19
20                if (rows[i][num] || cols[j][num] || boxes[box][num]) {
21                    return false;
22                }
23
24                rows[i][num] = true;
25                cols[j][num] = true;
26                boxes[box][num] = true;
27            }
28        }
29
30        return true;
31    }
32}