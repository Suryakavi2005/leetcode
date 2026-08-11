// Last updated: 8/11/2026, 11:28:19 AM
class Solution {
    public int longestConsecutive(int[] nums) {
      int n=nums.length;
      int maxlen=0;
      if(n==0){
        return 0;
      }
      int count=1;
      Arrays.sort(nums);
      for(int i=1;i<n;i++){
        if(nums[i]==nums[i-1]){
            continue;
      }
      if(nums[i]-1==nums[i-1]){
        count++;
      }
      else{
        maxlen=Math.max(maxlen,count);
        count=1;
      }
      }
       
        return Math.max(maxlen,count);
    }
}