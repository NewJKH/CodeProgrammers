class Solution {
    public String solution(String phone_number) {
        String answer = "*".repeat(phone_number.length()-4);
        String b = phone_number.substring(phone_number.length()-4);
        return answer+b;
    }
}