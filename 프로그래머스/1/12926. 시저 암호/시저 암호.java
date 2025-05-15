class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for ( int i = 0 ; i < n ; i ++){
            for ( int j = 0 ; j<arr.length; j++){
                if ( arr[j] == ' ') continue;
                if ( arr[j] == 'z' || arr[j] == 'Z' ){
                   arr[j] = (char) ( arr[j]-26); 
                }
                arr[j] = (char) (arr[j] + 1);
            }
        }
        return new String(arr);
    }
}