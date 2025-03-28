class Solution {
    public String solution(String s) {
        String[] arr = sliceString(s);
        int[] nums = unitString(arr);
        String mm = compare(nums);
        
        return mm;
    }
    public String[] sliceString(String s){
        return s.trim().split(" ");
    }
    
    public int[] unitString(String[] arr){
        int[] k = new int[arr.length];
        for (int i=0;i<arr.length;i++) {
            k[i] = Integer.parseInt(arr[i]);
        }
        return k;
    }
    
    public String compare(int[] nums){
        int min = nums[0];
        int max = nums[0];
        
        for ( int i = 0 ; i<nums.length; i++){
            min = Math.min(min,nums[i]);
            max = Math.max(max,nums[i]);
        }
        
        return min +" "+ max;
    }
}