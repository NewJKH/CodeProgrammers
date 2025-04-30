import java.util.concurrent.atomic.AtomicInteger;
import java.util.Arrays;

public class Solution {
    public double solution(int[] arr) {
        AtomicInteger sum = new AtomicInteger();

        Arrays.stream(arr)
              .forEach(sum::addAndGet);

        return (double) sum.get() / arr.length;
    }
}
