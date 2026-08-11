// Last updated: 8/11/2026, 11:26:07 AM
class Solution {
    public int maximumDifference(int[] nums) {
       int curr;
       int max=-1;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
            if(nums[i]<nums[j]){
                curr=nums[j]-nums[i];
                max=Math.max(max,curr);
            }
            }
        }
        return max;
    }
}