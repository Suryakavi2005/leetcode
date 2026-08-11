// Last updated: 8/11/2026, 11:29:02 AM
class Solution {
    public int longestValidParentheses(String s) {
        int left=0;
        int right=0;
        int max=0;
        int i=0;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i) == '(')
            left++;
            else{
                right++;
            }
            if(right==left){
                max=Math.max(max,left*2);
            }
            if(right>left)
            {
                left=0;
                right=0;
            }
        }
       
     left=0;
     right=0;
   for(i=s.length()-1;i>=0;i--)
   {
    if(s.charAt(i) == '(')
            left++;
            else{
                right++;
            }
            if(right==left){
                max=Math.max(max,left*2);
            }
            if(left>right )
            {
                left=0;
                right=0;
            }
            }
            return max;
    }
}