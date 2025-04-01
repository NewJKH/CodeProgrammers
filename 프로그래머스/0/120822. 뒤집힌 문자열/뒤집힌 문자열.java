class Solution {
    public String solution(String my_string) {
        String answer = "";
        int size = my_string.toCharArray().length;
        for ( int i = size-1; i>=0;i--){
            answer += my_string.toCharArray()[i];
        }
        return answer;
    }
}