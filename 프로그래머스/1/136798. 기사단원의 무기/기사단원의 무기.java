class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        for ( int i = 1; i <= number; i++ ){
            int count = 약수_갯수(i);
            if ( limit < count ){
                count = power;
            }
            answer+=count;
        }
        return answer;
    }
    private int 약수_갯수(int num) {
        int count = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i * i == num) count++;
                 else count += 2;
            }
        }
        return count;
    }
}