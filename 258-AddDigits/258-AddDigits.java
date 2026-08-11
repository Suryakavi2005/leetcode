// Last updated: 8/11/2026, 11:27:28 AM
class Solution {
    public int addDigits(int num) {
         while (num >= 10) {   
            int sum = 0;
            while (num > 0) {
                sum += num % 10;  
                num /= 10;
            }
            num = sum;  
        }

       return num;
    }
}
