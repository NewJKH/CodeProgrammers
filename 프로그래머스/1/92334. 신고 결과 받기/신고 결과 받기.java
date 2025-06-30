import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Set<String> rep = initReport(report);
        Map<String, Integer> map = new HashMap<>();
        
        Map<String, List<String>> reporterMap = new HashMap<>();
        for ( String s : rep ){ // 자신이 신고당한 횟수 
            String[] re = s.split(" ");
            String who = re[0];
            String target = re[1];
            map.put(target, map.getOrDefault(target, 0) + 1);
            reporterMap.computeIfAbsent(who, v -> new ArrayList<>()).add(target);
        }
        
        Set<String> banned = new HashSet<>(); // 밴 항복에 추가
        for ( int i = 0; i < id_list.length; i++ ) {
            String id = id_list[i];
            int count = map.getOrDefault(id, 0);
            if ( count == 0 ) continue;   
            if ( count >= k ){
                banned.add(id);
            }
        }
        
        int[] answer = new int[id_list.length];
        Map<String, Integer> mail = new HashMap<>();
        for (String re : reporterMap.keySet()) {
            List<String> targets = reporterMap.get(re);
            int count = 0;
            for (String t : targets) {
                if (banned.contains(t)) {
                    count++;
                }
            }
            mail.put(re, count);
        }

        
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mail.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
    private Set<String> initReport(String[] report){ // 여기서 모든 중복 신고를 제거한다.
        Set<String> rep = new HashSet<>();
        for ( String s : report){
            rep.add(s);
        }
        return rep;
    }
}