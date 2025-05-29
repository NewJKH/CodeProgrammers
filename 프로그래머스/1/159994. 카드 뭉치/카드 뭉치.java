import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> fc = new LinkedList<>(List.of(cards1));
        Queue<String> sc = new LinkedList<>(List.of(cards2));

        for (String word : goal) {
            if (!fc.isEmpty() && word.equals(fc.peek())) {
                fc.remove();
            } else if (!sc.isEmpty() && word.equals(sc.peek())) {
                sc.remove();
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}