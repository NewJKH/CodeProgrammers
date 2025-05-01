import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public long solution(long n) {
        List<Long> list = new ArrayList<>();
        while (n>0){
            long a = n%10;
            n /=10;
            list.add(a);
        }
        list.sort(Comparator.reverseOrder());
        
        long result = 0;
        for (long digit : list) {
            result = result * 10 + digit;
        }
        
        return result;
    }
}