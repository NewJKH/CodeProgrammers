import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i : lost) list1.add(i);
        for (int i : reserve) list2.add(i);
        
        list1.sort(Comparator.naturalOrder());
        list2.sort(Comparator.naturalOrder());
        
        List<Integer> list11 = new ArrayList<>(list1);
        List<Integer> list22 = new ArrayList<>(list2);

        list1.removeAll(list22);
        list2.removeAll(list11);

        n -= list1.size();

        for ( int v1 : list1){
            int min = v1-1;
            int max = v1+1;
            for ( int v2 : list2 ){
                if ( v2 == min || v2 == max ) {
                    list2.remove(Integer.valueOf(v2));
                    n++;
                    break;
                }
            }
        }

        return n;
    }
}