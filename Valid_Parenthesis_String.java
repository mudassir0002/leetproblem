class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                if (low > 0) low--;
                high--;
            } else { // '*'
                if (low > 0) low--;  // '*' as ')'
                high++;             // '*' as '('
            }

            if (high < 0) return false;  // More ')' than '('
        }

        return low == 0;
    }
}
