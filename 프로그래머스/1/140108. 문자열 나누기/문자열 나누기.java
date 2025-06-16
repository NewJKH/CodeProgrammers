import java.util.*;

class Solution {
    /*
        banana 
        b 1 - a 1
    */
    public int solution(String s) {
         int count = 1;
        int nonCount = 0;
        int answer = 1;
        char first = s.charAt(0);
        char[] arr = s.toCharArray();
        for ( int i = 1; i<arr.length; i++){
            if ( first == arr[i] ){
                count++;
            }
            else {
                nonCount++;
            }
            if ( count == nonCount ){
                if ( i+1 < arr.length ) {
                    first = arr[i + 1];
                    count = 0;
                    nonCount = 0;
                    answer++;
                }
            }
        }

        return answer;
    }
}