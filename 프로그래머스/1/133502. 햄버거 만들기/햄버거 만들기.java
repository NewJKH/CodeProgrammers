class Solution {
    public int solution(int[] ingredient) {
        StringBuilder stack = new StringBuilder();
        int count = 0;

        for (int i : ingredient) {
            stack.append(i);

            if (stack.length() >= 4 &&
                    stack.substring(stack.length() - 4).equals("1231")) {
                stack.setLength(stack.length() - 4);
                count++;
            }
        }

        return count;
    }
}