// Last updated: 8/11/2026, 11:26:57 AM
class Solution {
    public int longestPalindrome(String s) {
        int count[]=new int[128];
        for(char c : s.toCharArray()){
            count[c]++;
        }
        int len=0;
        for(int num : count){
          len+=(num/2)*2;
        }
         if(len< s.length()){
            len++;
         }
         return len;
    }
}