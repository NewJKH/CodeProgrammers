class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean space = true;
        for (char c : s.toCharArray()) {
            sb.append(space ? Character.toUpperCase(c) : Character.toLowerCase(c));
            space = c == ' ';
        }
        return sb.toString();
    }
}