// Last updated: 9/2/2026, 12:11:17 PM
1class Solution {
2    public boolean isPalindrome(String s) {
3
4        String str = "";
5        for (int i = 0; i < s.length(); i++) {
6
7            char ch = s.charAt(i);
8
9            if (Character.isLetterOrDigit(ch)) {
10                str = str + Character.toLowerCase(ch);
11            }
12        }
13
14        // Check palindrome
15        int left = 0;
16        int right = str.length() - 1;
17
18        while (left < right) {
19
20            if (str.charAt(left) != str.charAt(right)) {
21                return false;
22            }
23
24            left++;
25            right--;
26        }
27
28        return true;
29    }
30}