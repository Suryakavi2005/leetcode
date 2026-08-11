// Last updated: 8/11/2026, 11:26:03 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxword=0;
        for(int i=0;i<sentences.length;i++){
            String str[]=sentences[i].split(" "); 
            int count=str.length;
        
        if(count>maxword){
               maxword=count;
        }
        }
        return maxword;
    }
}