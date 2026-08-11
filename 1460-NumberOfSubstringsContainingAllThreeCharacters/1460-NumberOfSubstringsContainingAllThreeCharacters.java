// Last updated: 8/11/2026, 11:26:27 AM
// class Solution {
//     public int numberOfSubstrings(String s) {

//         int count = 0;

//         for (int i = 0; i < s.length(); i++) {

//             boolean a = false;
//             boolean b = false;
//             boolean c = false;

//             for (int j = i; j < s.length(); j++) {

//                 if (s.charAt(j) == 'a')
//                     a = true;
//                 else if (s.charAt(j) == 'b')
//                     b = true;
//                 else if (s.charAt(j) == 'c')
//                     c = true;

//                 if (a && b && c) {
//                     count++;
//                 }
//             }
//         }

//         return count;
//     }
// }
class Solution {
    public int numberOfSubstrings(String s) {

        int[] last = {-1, -1, -1};
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            last[s.charAt(i) - 'a'] = i;

            count += Math.min(last[0], Math.min(last[1], last[2])) + 1;
        }

        return count;
    }
}