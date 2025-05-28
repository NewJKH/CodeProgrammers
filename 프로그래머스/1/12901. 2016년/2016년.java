import java.time.LocalDate;

class Solution {
    public String solution(int a, int b) {
        String[] arr = new String[]{"MON","TUE","WED","THU","FRI","SAT","SUN"};
        LocalDate date = LocalDate.of(2016, a, b);
        return arr[date.getDayOfWeek().getValue()-1];
    }
}