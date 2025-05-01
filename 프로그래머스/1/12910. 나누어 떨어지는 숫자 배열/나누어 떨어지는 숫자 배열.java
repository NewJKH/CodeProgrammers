import java.util.*;

class Solution {
    public static int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for ( int num : arr ){
            if ( num % divisor == 0) list.add(num);
        }
        list.sort(Comparator.naturalOrder());
        if ( list.isEmpty() ) return new int[]{-1};


        int[] as = new int[list.size()];
        for ( int i = 0; i< list.size();i++){
            as[i] = list.get(i);
        }

        return as;
    }
}