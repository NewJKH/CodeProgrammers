class Solution {
    public String[] solution(String[] strings, int n) {
        return 정렬(strings, n);
    }

    private String[] 정렬(String[] strings, int n) {
        for (int i = 0; i < strings.length - 1; i++) {
            for (int j = i + 1; j < strings.length; j++) {
                char c1 = strings[i].charAt(n);
                char c2 = strings[j].charAt(n);

                if (c1 > c2 || (c1 == c2 && strings[i].compareTo(strings[j]) > 0)) {
                    String temp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = temp;
                }
            }
        }
        return strings;
    }
}