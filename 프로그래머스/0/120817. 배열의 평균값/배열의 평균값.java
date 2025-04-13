import java.util.Arrays;

class Solution {
    public double solution(int[] numbers) {
        double sum = 0;
        for (int number : numbers) {
            sum += (double) number /numbers.length;
        }
        return sum;
    }
}