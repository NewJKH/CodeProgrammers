class Solution {
    /*
        알고리즘 완전 탐색으로 풀기
    */
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            answer += brute(i, n);
        }

        return answer;
    }

    private int brute(int i, int n) {
        int temp = n - (i * (i-1) / 2);
        if (temp <= 0) return 0;
        return temp % i == 0 ? 1 : 0;
    }
}
