class Solution {
    boolean solution(String s) {
        boolean answer = true;
        if ( !(startWith(s) && endWith(s)) ){
            return false;
        }
        return compare(s);
    }
    
    public boolean startWith(String s){
        return s.startsWith("(");
    }
    
    public boolean endWith(String s){
        return s.endsWith(")");
    }
    
    public boolean compare(String s){
        int openCount = 0;
        int closeCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                closeCount++;
            }
            if ( openCount < closeCount ) return false;
        }
        return openCount == closeCount;
    }
    /*
    풀이 : 
        1. 시작은 [)] 닫을 수 없다.
        2. 끝은 [(] 열 수 없다.
        3. 괄호는 갯수가 다를 수 없다. 항상 일치해야한다.
        4. 앞에 있는 [(] 괄호보다 [)] 닫기 괄호가 더 많을 수 없다.
    */
}