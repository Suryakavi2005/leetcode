// Last updated: 8/11/2026, 11:28:09 AM
class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String str[]=s.split("\\s+");
        String rev="";
       for(int i=str.length-1;i>=0;i--){
           rev+=str[i];
           if(i>0){
            rev+=" ";
           }
       }
         return rev;
    }
}