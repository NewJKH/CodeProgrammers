class Solution {
    public String solution(String s) {
        char[] arr = s.toCharArray();
        int size = s.length();
         
        for ( int i = 0; i < size-1;i ++){
            for ( int j = i ; j < size ; j++){
                if ( arr[i] < arr[j] ){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        StringBuilder st = new StringBuilder();
        for (char c : arr) {
            st.append(c);
        }
        return st.toString();
    }
}