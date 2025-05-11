class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a = arr1.length;
        int b = arr1[0].length;
        int[][] answer = new int[a][b];
        
        for ( int i = 0; i < a ;i++ ){
            for ( int j = 0; j<b; j++){
                int x1 = arr1[i][j];
                int x2 = arr2[i][j];
                answer[i][j] = x1+x2;
            }
        }
        
        return answer;
    }
}