class Solution {
    public String solution(String s) {
       int size = s.length();
        int a = size/2;

        return size % 2 == 0 ? s.substring(a-1,a+1) : s.substring(a,a+1);
    }
}