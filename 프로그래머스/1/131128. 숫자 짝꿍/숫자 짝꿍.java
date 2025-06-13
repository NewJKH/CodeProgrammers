import java.util.Arrays;

class Solution {
    public String solution(String x, String y) {
        int[] countX = new int[10];
        int[] countY = new int[10];

        for (char c : x.toCharArray()) {
            countX[c - '0']++;
        }
        for (char c : y.toCharArray()) {
            countY[c - '0']++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 9; i >= 0; i--) {
            int commonCount = Math.min(countX[i], countY[i]);
            result.append(String.valueOf(i).repeat(commonCount));
        }

        if (result.length() == 0) return "-1";

        if (result.charAt(0) == '0') return "0";

        return result.toString();
    }
}