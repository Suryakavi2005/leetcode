// Last updated: 8/11/2026, 11:29:51 AM
class Solution
{
    public int[] twoSum(int[] nums, int target) 
    {
     int k=0;
     for(int i=0;i<nums.length;i++){
        for( k=i+1;k<nums.length;k++){
            if(nums[i]+nums[k]==target){
                
               return new int[]{i, k};
            }
        }
     }
    
return null;

    }

}    
    