class Solution {
    fun solution(my_string: String, n: Int): String {
        var answer = "";
        for ( c in my_string ){
            for ( i in 1 .. n ){
                answer += c;
            }
        }
        return answer
    }
}