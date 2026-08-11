// Last updated: 8/11/2026, 11:26:41 AM
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
     Stack<Integer> stack=new Stack<>();
     for(int i=0;i<n;i++){
        while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
               int a=stack.pop();
               ans[a]=i-a;
        }
        stack.push(i);
     }
     return ans;
    }
}