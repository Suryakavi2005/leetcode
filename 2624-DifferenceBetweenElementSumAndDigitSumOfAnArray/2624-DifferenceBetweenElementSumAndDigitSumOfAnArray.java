// Last updated: 8/11/2026, 11:25:51 AM
class Solution {
    public int differenceOfSum(int[] nums) {
        int element=0;
        int digit=0;
        int rem=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            element+=nums[i];
             int n= nums[i];
            while(n!=0){
             digit+=n%10;
             n/=10;
            }
        }
        return element-digit;
    }
}