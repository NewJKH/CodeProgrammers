import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> list = new ArrayList<>();
        int[] result = new int[score.length];

        for ( int i = 0; i < score.length; i++){
            int com = score[i];
            if ( list.size() < k ) list.add(com);
            else {
                if ( com > list.get(k-1))list.set(k-1,com);
            }
            list.sort(Collections.reverseOrder());
            result[i] = list.get(list.size()-1);
        }

        return result;
    }
}