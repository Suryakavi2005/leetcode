// Last updated: 9/2/2026, 2:01:50 PM
1import java.util.*;
2
3class Solution {
4    public int calculate(String s) {
5        Stack<Integer> stack = new Stack<>();
6
7        int result = 0;
8        int number = 0;
9        int sign = 1;
10
11        for (int i = 0; i < s.length(); i++) {
12            char ch = s.charAt(i);
13
14            if (Character.isDigit(ch)) {
15                number = number * 10 + (ch - '0');
16            }
17
18            else if (ch == '+') {
19                result += sign * number;
20                number = 0;
21                sign = 1;
22            }
23
24            else if (ch == '-') {
25                result += sign * number;
26                number = 0;
27                sign = -1;
28            }
29
30            else if (ch == '(') {
31                stack.push(result);
32                stack.push(sign);
33
34                result = 0;
35                sign = 1;
36            }
37
38            else if (ch == ')') {
39                result += sign * number;
40                number = 0;
41
42                int oldSign = stack.pop();
43                int oldResult = stack.pop();
44
45                result = oldResult + oldSign * result;
46            }
47        }
48
49        result += sign * number;
50
51        return result;
52    }
53}