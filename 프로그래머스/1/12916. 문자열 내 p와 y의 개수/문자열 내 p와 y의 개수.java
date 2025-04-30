class Solution {
    boolean solution(String s) {
        long p = 0;
        long y = 0;

        for ( char c : s.toCharArray()){
            if ( c == 'p' || c == 'P') p++;
            else if ( c == 'y' || c == 'Y' ) y++;
        }
        return p == y;
    }
}