import java.util.*;

class Solution {
    public String solution(String[] seoul) {
        
        List<String> list = new ArrayList<>(List.of(seoul));
        int index = list.indexOf("Kim");
        
        return "김서방은 "+index+"에 있다";
    }
}