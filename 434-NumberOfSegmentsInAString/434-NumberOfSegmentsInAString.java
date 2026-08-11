// Last updated: 8/11/2026, 11:26:50 AM
class Solution {
    public int countSegments(String s) {
        if(s.trim().isEmpty()) return 0;
        String[] str = s.trim().split("\\s+");
        return str.length;
    }
}