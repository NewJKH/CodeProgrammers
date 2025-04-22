import java.util.*;

class Solution {
    public int solution(int k, int[] v) {
        return minTypesToBuy(k,groupBySize(v));
    }
    
    private static int minTypesToBuy(int k, Map<Integer, Integer> box) {
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(box.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        int min = 0;
        int ck = k;

        for (Map.Entry<Integer, Integer> entry : list) {
            if ( ck > 0 ) {
                ck -= entry.getValue();
                min++;
            }
        }

        return min;
    }

    private static Map<Integer, Integer> groupBySize(int[] v) {
        Map<Integer, Integer> box = new HashMap<>();

        for (int i : v) {
            box.put(i, box.getOrDefault(i, 0) + 1);
        }

        return box;
    }
}
/*
    그리디 알고리즘을 사용해서 풀이
*/