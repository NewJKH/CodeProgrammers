class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;
        int bottles = n;

        while (bottles >= a) {
            int remain = (bottles / a) * b;
            total += remain;
            bottles = (bottles % a) + remain;
        }

        return total;
    }
}