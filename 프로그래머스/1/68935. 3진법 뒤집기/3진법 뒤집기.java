import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> arr = new ArrayList<>();
        
        while(n>0){
            int a = n%3;
            n /= 3;
            arr.add(a); 
        }
        for ( int i : arr ){
            System.out.print(i);
        }
        int t = 0;
        for ( int i = 0 ; i< arr.size(); i++){
            int m = 1;
            int num = arr.get(i);
            for ( int j = arr.size()-i-1 ; j > 0 ; j--){
                m *= 3;
            }
            t += num*m;
        }
            
        return t;
    }
}