class Solution {
    public int solution(String s) {
        int sign = 1;
        int start = 0;
        if (s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (s.charAt(0) == '+') {
            start = 1;
        }

        int result = 0;
        for (int i = start; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0');
        }
        return sign * result;
    }
}