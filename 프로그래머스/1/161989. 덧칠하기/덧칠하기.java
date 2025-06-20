class Solution {
    public int solution(int n, int m, int[] section) {
        int min = 0;
        int lp = 0;

        for (int i = 0; i < section.length; i++) {
            if (section[i] > lp) {
                lp = section[i] + m - 1;
                min++;
            }
        }

        return min;
    }
}