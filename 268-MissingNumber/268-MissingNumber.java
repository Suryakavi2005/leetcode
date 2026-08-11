// Last updated: 8/11/2026, 11:27:23 AM
import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        if (nums[0] != 0) {
            return 0;
        }

        int n = nums.length;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] != nums[i + 1] - 1) {
                return nums[i] + 1;
            }
        }

        return n;
    }
}