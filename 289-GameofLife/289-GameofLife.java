// Last updated: 9/2/2026, 1:47:46 PM
1class Solution {
2    public void gameOfLife(int[][] board) {
3        int m = board.length;
4        int n = board[0].length;
5
6        int[][] newBoard = new int[m][n];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                int liveNeighbors = 0;
11
12                for (int row = i - 1; row <= i + 1; row++) {
13                    for (int col = j - 1; col <= j + 1; col++) {
14                        if (row == i && col == j) {
15                            continue;
16                        }
17
18                        if (row >= 0 && row < m && col >= 0 && col < n) {
19                            if (board[row][col] == 1) {
20                                liveNeighbors++;
21                            }
22                        }
23                    }
24                }
25
26                if (board[i][j] == 1) {
27                    if (liveNeighbors == 2 || liveNeighbors == 3) {
28                        newBoard[i][j] = 1;
29                    }
30                } else {
31                    if (liveNeighbors == 3) {
32                        newBoard[i][j] = 1;
33                    }
34                }
35            }
36        }
37
38        for (int i = 0; i < m; i++) {
39            for (int j = 0; j < n; j++) {
40                board[i][j] = newBoard[i][j];
41            }
42        }
43    }
44}