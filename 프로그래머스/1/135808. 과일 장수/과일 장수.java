import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);
        int answer = 0;
        
        for (int i = score.length - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }

        return answer;
    }
}