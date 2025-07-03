import java.util.Stack;

class Solution {
    public int[] solution(String s) {
        int originStr = s.length();
        int zeroCount = 0;
        int loopCount = 0;
        while(s.length() > 1){
            s = s.replaceAll("0","");
            zeroCount += originStr - s.length();
            
            // s 를 2진법
            Stack<Integer> stack = new Stack<>();
            int decimal = s.length();
            while (decimal > 0) {
              int remainder = decimal % 2;
              stack.push(remainder);
              decimal /= 2;
            }

            StringBuilder sb = new StringBuilder();
            while (!stack.isEmpty()) {
              sb.append(stack.pop());
            }

            s = sb.toString();
            originStr = s.length();
            loopCount++;
        }
        return new int[]{loopCount,zeroCount};
    }   
}