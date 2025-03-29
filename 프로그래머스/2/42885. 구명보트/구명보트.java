import java.util.*;

class Solution {
    public int solution(int[] people, int limit) { 
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) { 
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--; 
            boats++; 
        }
        
        return boats;
    }

    /*
    방법 정리
    1. 정렬 
    2. 가장 무거운 사람 right
    3. 가장 가벼운 사람 left
    4. index[left] 와 [right] 가 합산해서 limit 을 넘지않는 경우 
    5. 가벼운 사람은 태우고 / 무거운 사람은 어차피 무조건 탐(혼자서 보트사용도 가능)
    */
}