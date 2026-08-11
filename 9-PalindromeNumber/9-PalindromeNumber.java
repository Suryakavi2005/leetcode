// Last updated: 8/11/2026, 11:29:36 AM
class Solution {
    public boolean isPalindrome(int x) {
       if(x<0)
       return false;
       int original=x;
       int palindrom=0;
       while(x>0)
       {
        int digit=x%10;
        palindrom=palindrom*10+digit;
        x/=10;
       }
       if (original == palindrom)
            return true;
        else
            return false;
    }
}