import java.util.*;

class Solution {
    private final Map<String,Integer> MAP = new HashMap<>(Map.of(
            "zero",0,
            "one",1,
            "two",2,
            "three",3,
            "four",4,
            "five",5,
            "six",6,
            "seven",7,
            "eight",8,
            "nine",9
        )
    );
    
    public int solution(String s) {
        for ( Map.Entry<String,Integer> entry : MAP.entrySet()){
            if ( s.contains(entry.getKey()) ){
                s = s.replace(entry.getKey(), entry.getValue().toString() );
            }
        }
        return Integer.parseInt(s);
    }
}