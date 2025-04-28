class Solution {
    public String solution(int num) {;
        return switch (num % 2) {
            case 0 -> "Even";
            default -> "Odd";
        };
    }
}