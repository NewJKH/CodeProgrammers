import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        StringBuilder builder = new StringBuilder();
        Map<Character, Integer> map = new HashMap();
        
        for ( int i = 0; i < survey.length; i++){
            String k = survey[i]; 
            int v = choices[i]-4; 
            char c = v > 0 ? k.charAt(1) : k.charAt(0);
            map.put(c,map.getOrDefault(c,0)+Math.abs(v));
        }
        
        int r = map.getOrDefault('R',0);
        int t = map.getOrDefault('T',0);
        char rt = r >= t ? 'R' : 'T';
        builder.append(rt);
        
        int c = map.getOrDefault('C',0);
        int f = map.getOrDefault('F',0);
        char cf = c >= f ? 'C' : 'F';
        builder.append(cf);
        
        int j = map.getOrDefault('J',0);
        int m = map.getOrDefault('M',0);
        char jm = j >= m ? 'J' : 'M';
        builder.append(jm);                
        
        int a = map.getOrDefault('A',0);
        int n = map.getOrDefault('N',0);
        char an = a >= n ? 'A' : 'N';
        builder.append(an);                
                    
        return builder.toString();
    }
}