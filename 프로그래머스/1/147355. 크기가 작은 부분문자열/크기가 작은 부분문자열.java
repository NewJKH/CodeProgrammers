import java.util.ArrayList;
import java.util.List;

class Solution {
   
    public int solution(String t, String p) {
        List<Long> list = 자르기(t, p.length());
        long v = Long.parseLong(p);
        int count = 0;
        for ( long i : list ){
            if ( i <= v ) count++;
        }
        return count;
    }
    private List<Long> 자르기(String t, int size){
        List<Long> list = new ArrayList<>();
        char[] arr = t.toCharArray();
        for ( int i = 0; i< arr.length-size+1; i++ ){
            char[] arr2 = new char[size];
            for ( int j = i; j < i+size; j++){
                if ( j >= arr.length) break;
                arr2[j-i] = arr[j];
            }
            String str = new String(arr2);
            list.add(Long.valueOf(str));
        }
        return list;
    }
}