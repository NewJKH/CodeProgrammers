class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for ( int i = s.length()-1; i >= 0; i-- ){
            char base = s.charAt(i);
            answer[i] = -1;
            
            for ( int j = i-1; j >= 0; j-- ){
                char c = s.charAt(j);
                if ( base == c){
                    answer[i] = i-j;
                    break;
                }
            }
        }
        return answer;
    }
}