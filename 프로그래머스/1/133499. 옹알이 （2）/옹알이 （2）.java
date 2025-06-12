class Solution {
    public int solution(String[] babbling) {
        int sum = 0;
        String[] arr = new String[]{"aya", "ye", "woo", "ma"};

        for (String word : babbling) {
            String prey = "";
            boolean isValid = true;

            for (int i = 0; i < arr.length; i++) {
                if (word.startsWith(arr[i])) {
                    if (prey.equals(arr[i])) {
                        isValid = false;
                        break;
                    }
                    word = word.replaceFirst(arr[i], "");
                    prey = arr[i];
                    i = -1;
                    if (word.isEmpty()) {
                        break;
                    }
                }
            }

            if (isValid && word.isEmpty()) {
                sum++;
            }
        }

        return sum;
    }
}