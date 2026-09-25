class Solution {

    public int myAtoi(String s) {

        int ans = 0;
        int sign = 1;
        boolean started = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ' && !started) {
                continue;
            }

            if ((ch == '+' || ch == '-') && !started) {
                sign = (ch == '-') ? -1 : 1;
                started = true;
                continue;
            }

            if (Character.isDigit(ch)) {

                int digit = ch - '0';

                if (ans > (Integer.MAX_VALUE - digit) / 10) {
                    if (sign == -1) {
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }

                ans = ans * 10 + digit;
                started = true;

            } else {
                return ans * sign;
            }
        }

        return ans * sign;
    }
}