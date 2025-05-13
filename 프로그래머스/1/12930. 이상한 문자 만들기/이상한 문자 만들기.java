class Solution {
    public String solution(String s) {
        StringBuilder builder = new StringBuilder();
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ' ') {
                builder.append(ch);
                index = 0;
            } else {
                if (index % 2 == 0) {
                    builder.append(Character.toUpperCase(ch));
                } else {
                    builder.append(Character.toLowerCase(ch));
                }
                index++;
            }
        }

        return builder.toString();
    }

}