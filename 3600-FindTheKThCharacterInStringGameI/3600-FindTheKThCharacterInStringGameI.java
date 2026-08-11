// Last updated: 8/11/2026, 11:25:52 AM
class Solution {
    public char kthCharacter(int k) {
          return (char)('a'+Integer.bitCount(k-1));                  
        
    }
}