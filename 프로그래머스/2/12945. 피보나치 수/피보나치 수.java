import java.math.BigInteger;

class Solution {
    // 재귀함수 ( 시간복잡도 엄청 크다. 통과가 안되네 )
    public int solution(int n) {
        return fabo(n);
    }
    // private int fabo(int a){
    //     if ( a == 0 ) return 0;
    //     if ( a == 1 ) return 1;
    //     return fabo(a-1) + fabo(a-2);
    // }
    private int fabo(int n){
        if (n == 0) return 0;
        if (n == 1) return 1;
        
        int a = 0;
        int b = 1;
        
        for (int i = 2; i <= n; i++) {
            int temp = (a% 1234567) +(b % 1234567);
            temp = temp%1234567;
            a = b;
            b = temp;
        }

        return b;
    }
}