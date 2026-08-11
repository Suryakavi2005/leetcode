// Last updated: 8/11/2026, 11:26:15 AM
class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count=0;
        for(String pattern:patterns){
            if(word.contains(pattern)){
                count++;
            }
        }
        return count;
    }
}