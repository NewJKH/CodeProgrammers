class Solution {
    public int[] solution(int[] t) {
    if ( t.length == 1 ) return new int[]{-1};
        int[] arr = t.clone();
        int[] as = new int[arr.length-1];
        for ( int i = 0 ; i<arr.length;i++){
            for ( int j = i; j<arr.length; j++){
                if ( arr[i] < arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        int min = arr[t.length-1];
        int index = 0;
        for ( int i = 0; i<t.length;i++){
            if ( min == t[i]) continue;
            as[index] = t[i];
            index++;
        }

        return as;
    }
}