class Solution {
    public int myAtoi(String s) {
        int ans = 0;
        int sign = 1;
        boolean flag = false;
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            // Skip spaces
            if (!flag && ch[i] == ' ') {
                continue;
            }

            // Check for sign
            if (!flag && (ch[i] == '-' || ch[i] == '+')) {
                sign = (ch[i] == '-') ? -1 : 1;
                flag = true;
                continue;
            }

            // Check for digit
            if (ch[i] >= '0' && ch[i] <= '9') {
                flag = true;
                int digit = ch[i] - '0';

                // Overflow check
                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }

                ans = ans * 10 + digit;
            } else {
                // Break if non-digit character after starting number
                if (flag) break;
                else return 0;
            }
        }

        return ans * sign;
    }
}
