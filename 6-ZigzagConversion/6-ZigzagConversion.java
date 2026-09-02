// Last updated: 9/2/2026, 12:13:10 PM
1class Solution {
2    public String convert(String s, int numRows) {
3
4        if (numRows == 1) {
5            return s;
6        }
7
8        StringBuilder[] rows = new StringBuilder[numRows];
9        for (int i = 0; i < numRows; i++) {
10            rows[i] = new StringBuilder();
11        }
12        int row = 0;
13        boolean down = true;
14        for (int i = 0; i < s.length(); i++) {
15            rows[row].append(s.charAt(i));
16            if (row == numRows - 1) {
17                down = false;
18            }
19            if (row == 0) {
20                down = true;
21            }
22
23            if (down) {
24                row++;
25            } else {
26                row--;
27            }
28        }
29        StringBuilder answer = new StringBuilder();
30
31        for (int i = 0; i < numRows; i++) {
32            answer.append(rows[i]);
33        }
34
35        return answer.toString();
36    }
37}