import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for ( int i = 0; i < commands.length; i++){
            int x = commands[i][0]; // i
            int y = commands[i][1]; // j
            int z = commands[i][2]; // k

            int[] arr = new int[y-x+1];
            if (y - 1 - (x - 1) >= 0) System.arraycopy(array, x - 1, arr, 0, arr.length);

            for ( int a = 0; a < arr.length-1 ; a++){
                for ( int b = a ; b < arr.length ; b++){
                    if ( arr[a] > arr[b]){
                        int temp = arr[a];
                        arr[a] = arr[b];
                        arr[b] = temp;
                    }
                }
            }

            answer[i] = arr[z-1];
        }
        return answer;
    }
}