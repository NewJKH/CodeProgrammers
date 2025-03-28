class Solution {
    public int solution(int n) {
        int v = oneTest(n);
        int v2 = twoTest(n);
        int v3 = threeTest(n);
    
        return (int) Math.ceil(n / 7.0);
    }
    /**
    * @des 나머지가 생기는 경우 +1
    */
    public int oneTest(int n){
        if ( n % 7 == 0 ) return (int) (n/7);
        else return (int) (n/7)+1;
    }
    /**
    * @des 피자 조각별로 충분한지 for
    */
    public int twoTest(int n){
        int count = 0;
        for (int slices = 0; slices < n; count++) {
            slices += 7;
        }
        return count;
    }
    /**
    * @des 그냥 반올림
    */
    public int threeTest(int n){
        return (n + 6) / 7;
    }
}