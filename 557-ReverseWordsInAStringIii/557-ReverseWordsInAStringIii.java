// Last updated: 8/11/2026, 11:26:46 AM
class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=new StringBuilder(words[i]).reverse().toString();
                   // return w[i];
        }
     return String.join(" ",words);
        
    }
}
 