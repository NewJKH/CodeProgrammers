class Solution {
    fun solution(n: Int): Int {
        var count = 1;
        for ( i in 1 .. n/2 ){
            if ( n % i == 0 ){
                count++
            }
        }
        
        return count
    }
}