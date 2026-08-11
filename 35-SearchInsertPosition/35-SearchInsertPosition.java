// Last updated: 8/11/2026, 11:29:01 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
         for(int i=0;i<nums.length;i++){
         if (nums[i] >= target) {
                return i;  
            }
        }
        return nums.length;     
         
    }
}