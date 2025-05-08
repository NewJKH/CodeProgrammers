class Solution {
    public boolean solution(String s) {
        int size = s.length();
        if ( size != 4 && size != 6 ){
            return false;
        }
        
        if ( size<1 || size > 8){
            return false;
        }
        
        for (char c : s.toCharArray()) {
            if ( !Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}