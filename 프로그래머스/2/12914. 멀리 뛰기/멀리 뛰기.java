class Solution {
    public long solution(int n) {
        return fabo(n+1);
    }
    private long fabo(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long a = 0;
        long b = 1;

        for (long i = 2; i <= n; i++) {
            long temp = a%1234567 + b%1234567;
            a = b;
            b = temp%1234567;
        }

        return b;
    }
}