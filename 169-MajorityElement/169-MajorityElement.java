// Last updated: 8/11/2026, 11:27:55 AM
class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for (int num : nums) {

            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}