// Last updated: 8/11/2026, 11:28:40 AM
class Solution {
    public boolean canJump(int[] nums) {
       int i = 0;

    for (int reach = 0; i < nums.length && i <= reach; ++i)
      reach = Math.max(reach, i + nums[i]);

    return i == nums.length;
        
    }
}