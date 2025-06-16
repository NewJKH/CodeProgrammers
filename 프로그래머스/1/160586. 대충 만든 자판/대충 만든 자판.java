import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        Map<Character, Integer> map = get(keymap);
        /*
        char = A B C D E . . .
        int = index 
        */
        int[] answer = new int[targets.length];
        for ( int i = 0; i<targets.length; i++){
            String k = targets[i];
            int sum = 0;
            for ( char c : k.toCharArray()){
                if ( !map.containsKey(c) ) {
                    answer[i] = -1;
                    break;
                }
                sum += map.get(c);
            }
            if( answer[i] != -1 ) {
                sum += k.length();
                answer[i] = sum;
            }
        }

        return answer;
    }
    private Map<Character, Integer> get(String[] keymap){
        Map<Character, Integer> map = new HashMap();
        
        for ( String k : keymap){
            char[] arr = k.toCharArray();
            for ( int i = 0 ; i<arr.length;i++ ){
                int mapIndex = map.getOrDefault(arr[i], arr.length);
                if ( mapIndex > i ) {
                    map.put(arr[i],i);
                }
            }
        }
        return map;
    }
}