// Last updated: 8/11/2026, 11:25:48 AM
class Solution {
    public int averageValue(int[] nums) {
        int sum=0;
        int count=0;
        
        for(int i=0;i<nums.length;i++){
        if(nums[i] % 2==0 && nums[i] % 3==0 ){
            
            sum+=nums[i];
            count++;
            
        }
        }
        if(sum == 0){
            return 0;
        }
        
        return sum/count ;
    }
}
     