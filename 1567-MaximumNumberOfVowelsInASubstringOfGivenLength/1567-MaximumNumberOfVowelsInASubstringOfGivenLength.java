// Last updated: 8/11/2026, 11:26:20 AM
class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            if(i>=k){
                char chr=s.charAt(i-k);
                if(chr=='a'|| chr=='e'|| chr=='i'||chr=='o'||chr=='u'){
                count--;
            }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}