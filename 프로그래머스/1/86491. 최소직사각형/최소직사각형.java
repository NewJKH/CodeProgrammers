class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        sizes = 큰수뒤로(sizes);
        answer = 크기_고르기(sizes);
        return answer;
    }
    private int[][] 큰수뒤로(int[][] sizes){
        for ( int i = 0; i < sizes.length; i++){
            if ( sizes[i][0] > sizes[i][1] ){
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        
        return sizes;
    }
    private int 크기_고르기(int[][] sizes){
        int max = 0;
        int min = 0;
        for ( int i = 0; i < sizes.length; i++){
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            if ( a > max ) max = a;
            if ( b > min ) min = b;
            
        }
        
        return max*min;
    }
}