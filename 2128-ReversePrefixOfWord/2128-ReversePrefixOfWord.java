// Last updated: 8/11/2026, 11:26:14 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int p=word.indexOf(ch);
        String s= word.substring(0,p+1);
        String s2=word.substring(p+1);
        StringBuilder n=new StringBuilder(s);
        
            n.reverse();
         String s1=new String (n);
         String s3=s1 .concat(s2);
        return s3;
    }
}