// Last updated: 9/2/2026, 1:39:29 PM
1import java.util.*;
2
3class Solution {
4    public int evalRPN(String[] tokens) {
5
6        Stack<Integer> stack = new Stack<>();
7
8        for (String token : tokens) {
9
10            if (token.equals("+")) {
11                int b = stack.pop();
12                int a = stack.pop();
13                stack.push(a + b);
14            }
15
16            else if (token.equals("-")) {
17                int b = stack.pop();
18                int a = stack.pop();
19                stack.push(a - b);
20            }
21
22            else if (token.equals("*")) {
23                int b = stack.pop();
24                int a = stack.pop();
25                stack.push(a * b);
26            }
27
28            else if (token.equals("/")) {
29                int b = stack.pop();
30                int a = stack.pop();
31                stack.push(a / b);
32            }
33
34            else {
35                stack.push(Integer.parseInt(token));
36            }
37        }
38
39        return stack.peek();
40    }
41}