// Last updated: 8/11/2026, 11:27:39 AM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> n=new PriorityQueue<>();
           for(int m:nums){
            n.offer(m);
            if(n.size()>k){
                n.poll();
            }
           } 
          return n.peek();
    }
}