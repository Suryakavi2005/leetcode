// Last updated: 9/2/2026, 1:33:42 PM
1import java.util.*;
2
3class Solution {
4    public String simplifyPath(String path) {
5
6        Stack<String> stack = new Stack<>();
7
8        String[] parts = path.split("/");
9
10        for (String part : parts) {
11            if (part.equals("") || part.equals(".")) {
12                continue;
13            }
14            if (part.equals("..")) {
15
16                if (!stack.isEmpty()) {
17                    stack.pop();
18                }
19
20            } else {
21                stack.push(part);
22            }
23        }
24
25        StringBuilder result = new StringBuilder();
26
27        for (String part : stack) {
28            result.append("/");
29            result.append(part);
30        }
31
32        if (result.length() == 0) {
33            return "/";
34        }
35
36        return result.toString();
37    }
38}