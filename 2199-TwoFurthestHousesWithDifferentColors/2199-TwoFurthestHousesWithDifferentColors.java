// Last updated: 8/11/2026, 11:26:04 AM
class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    max=Math.max(max,j-i);
                }
            }
        }
        return max;
    }
}