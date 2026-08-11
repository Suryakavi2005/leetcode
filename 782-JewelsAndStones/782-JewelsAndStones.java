// Last updated: 8/11/2026, 11:26:38 AM
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        String letter="";
        int count=0;
        for(int i=0;i<jewels.length();i++){
            for(int j=0;j<stones.length();j++){
                if(jewels.charAt(i)==(stones.charAt(j))){
                    count++;
                }
            }
        }
        return count;
    }
}