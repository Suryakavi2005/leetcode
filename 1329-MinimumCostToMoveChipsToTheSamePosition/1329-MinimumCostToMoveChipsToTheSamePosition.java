// Last updated: 8/11/2026, 11:26:28 AM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

       
        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        if (evenCount < oddCount) {
            return evenCount;
        } else {
            return oddCount;
        }
    }
}
