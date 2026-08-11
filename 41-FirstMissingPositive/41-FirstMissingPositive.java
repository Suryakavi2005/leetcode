// Last updated: 8/11/2026, 11:28:58 AM
class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        int missing = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == missing) {
                missing++;
            }
        }

        return missing;
    }
}