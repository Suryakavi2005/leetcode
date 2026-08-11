// Last updated: 8/11/2026, 11:28:13 AM
class Solution {
    public int singleNumber(int[] nums) {
        int uni=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet()){
            if(map.get(num)==1){
                return num;
            }
        }
        return -1;
    }
}