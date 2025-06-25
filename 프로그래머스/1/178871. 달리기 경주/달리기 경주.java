import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        // 이름이 아니라 처음부터 이름 자체가 순번으로 저장했다면 어떨까?
        // 이름을 찾는다면 시간초과가 오래 걸린다면 처음부터 이름이 아닌 숫자를 저장해놓고 숫자만 바뀌게 저장
        
        // 1. 즉시즉시 바뀌게 하지않고 카운팅을 사용해서 푼다면? - 시도 결과 : 순서가 안맞아서 실패 
        // 2. 리스트로 변경 후 컬렉션의 swap 기능을 사용한다면? - 마찬가지로 시간초과 
        // 3. 
        
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String call : callings) {
            int idx = map.get(call);
            if (idx == 0) continue;

  
            String frontPlayer = players[idx - 1];

            players[idx - 1] = call;
            players[idx] = frontPlayer;

            map.put(call, idx - 1);
            map.put(frontPlayer, idx);
        }

        return players;

    }
}