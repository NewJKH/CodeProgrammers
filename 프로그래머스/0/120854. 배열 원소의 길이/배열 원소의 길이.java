class Solution {
    public int[] solution(String[] strlist) {
        int[] nums = new int[strlist.length];
        int index = 0;
        for ( String str : strlist ){
            nums[index] = str.length();
            index++;
        }
        return nums;
    }
}