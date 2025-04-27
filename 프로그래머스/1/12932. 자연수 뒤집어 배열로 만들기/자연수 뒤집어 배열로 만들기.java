import java.util.ArrayList;
import java.util.List;

class Solution {

    public int[] solution(long n) {
        return cutting(n);
    }
    
    private int[] cutting(long l){
        List<Integer> list = new ArrayList<>();
        while (l > 0) {
            long num = l % 10;
            l /= 10;
            list.add((int) num);
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }

}