import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;


class Solution {
    public int[] solution(String today, String[] terms, String[] pri) {
        Map<Character, Integer> times = new HashMap<>();
        for ( String t : terms ){
            char rank = t.charAt(0);
            String month = t.substring(2);
            times.put(rank, Integer.valueOf(month));
        }
        List<Integer> list = new ArrayList<>();
        LocalDate now = formatTime(today);

        for ( int i = 0 ; i< pri.length;i++ ){
            char rank = pri[i].charAt(11);
            int month = times.get(rank);

            String date = pri[i].substring(0,10);
            LocalDate localDate = formatTime(date);
            LocalDate newDate = localDate.plusMonths(month);
            if ( newDate.isBefore(now) || newDate.isEqual(now) ){
                list.add(i+1);
            }

        }
        int[] answer = new int[list.size()];
        for ( int n = 0; n<list.size(); n++ ){
            answer[n] = list.get(n);
        }
        return answer;
    }
    private LocalDate formatTime(String date){
        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy.MM.dd"));
    }
}