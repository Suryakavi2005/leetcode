// Last updated: 8/11/2026, 11:26:36 AM
class Solution {
    public int scoreOfParentheses(final String s) {
        final Stack<Integer> stack = new Stack<>();
        int score = 0;

        for(int i = 0; i < s.length(); ++i) {
            if(s.charAt(i) == '(') {
                stack.push(score);
                score = 0;
            } else {
                score = stack.pop() + (score == 0 ? 1 : 2 * score);
            }
        }

        return score;
    }
}

