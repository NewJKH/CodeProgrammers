class Solution {
    public static String solution(String s, String skip, int index) {
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            int shift = 0;
            char temp = c;
            while (shift < index) {
                temp++;
                if (temp > 'z') temp = 'a';
                if (skip.indexOf(temp) == -1) {
                    shift++;
                }
            }
            builder.append(temp);
        }

        return builder.toString();
    }
}