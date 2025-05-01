import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;


public class Solution {
    
     class Wrapper {
        int value = 0;
    }
    
    public double solution(int[] arr) {
        Wrapper sum = new Wrapper();

        Arrays.stream(arr)
                .forEach(value -> sum.value+=value);

        return (double) sum.value / arr.length;
    }
    /*
    public double solution(int[] arr) {
        AtomicInteger sum = new AtomicInteger();

        Arrays.stream(arr)
                .forEach(sum::addAndGet);

        return (double) sum.get() / arr.length;
    }
    */
}
