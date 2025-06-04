class Solution {
    public int[] solution(int[] answers) {
        int[] a = new int[]{1,2,3,4,5};
        int[] b = new int[]{2,1,2,3,2, 4,2,5};
        int[] c = new int[]{3,3,1,1,2, 2,4,4,5,5};
        
        int as = 0;
        int bs = 0;
        int cs = 0;
        
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == a[i % a.length]) as++;
            if (answers[i] == b[i % b.length]) bs++;
            if (answers[i] == c[i % c.length]) cs++;
        }
        
        int max = Math.max(as, Math.max(bs, cs));

        int count = 0;
        if (as == max) count++;
        if (bs == max) count++;
        if (cs == max) count++;

        
        int[] answer = new int[count];
        int index = 0;
        if (as == max) answer[index++] = 1;
        if (bs == max) answer[index++] = 2;
        if (cs == max) answer[index++] = 3;

        return answer;
    }
}