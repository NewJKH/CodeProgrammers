import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int a = s1.length;
        int b = s2.length;
 
        Set<String> s3 = new HashSet<>();
        s3.addAll(List.of(s1));
        s3.addAll(List.of(s2));
        
        return a+b-s3.size();
    }
}