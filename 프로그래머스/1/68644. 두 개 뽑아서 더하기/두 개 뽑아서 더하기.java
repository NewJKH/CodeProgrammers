import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        for (int number : numbers) {
            list.add(number);
        }
        List<Integer> newList = new ArrayList<>();

        for ( int i = 0 ; i < list.size()-1; i++){
            for ( int j = i+1; j < list.size(); j++){
                int sum = list.get(i) + list.get(j);
                if ( !newList.contains(sum)) newList.add(sum);
            }
        }

        newList.sort(Integer::compareTo);

        int[] answer = new int[newList.size()];
        for ( int i = 0; i< newList.size();i++){
            answer[i] = newList.get(i);
        }

        return answer;
    }
}