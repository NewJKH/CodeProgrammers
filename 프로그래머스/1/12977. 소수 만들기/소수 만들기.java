class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if ( 에라토스테네스의_체(sum) ) answer++;
                }
            }
        }
        
        return answer;
    }
    
    private boolean 에라토스테네스의_체(int n){
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
             if (n % i == 0) return false;
        }
        System.out.print(n+" ");
        return true;
    }
}
        
    