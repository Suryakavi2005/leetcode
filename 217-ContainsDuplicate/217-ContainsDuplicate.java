// Last updated: 8/11/2026, 11:27:37 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        
        return false;
    }
}