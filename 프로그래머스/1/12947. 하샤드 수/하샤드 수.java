class Solution {
    public boolean solution(int x) {
        int copy = x;
        int sum = 0;
        while(copy>0){
            sum += copy%10;
            copy/=10;
        }
        
        
        return x%sum == 0;
    }
}