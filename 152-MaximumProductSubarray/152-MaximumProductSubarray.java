// Last updated: 8/11/2026, 11:28:05 AM
class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int curnum = 1;

            for (int j = i; j < nums.length; j++) {
                curnum *= nums[j];
                max = Math.max(max, curnum);
            }
        }

        return max;
    }
}