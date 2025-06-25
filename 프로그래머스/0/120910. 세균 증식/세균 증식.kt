class Solution {
    fun solution(n: Int, t: Int): Int {
        var abc = n;
        for ( i in 1..t){
            abc*=2
        }
        return abc;
    }
}