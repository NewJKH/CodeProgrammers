class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zero = 0;
        int win = 0;
        for ( int v : lottos ){
            if ( v == 0 ) {
                zero++; 
                continue;
            }
            for ( int v2 : win_nums ){
                if ( v2 == v ) {
                    win++;
                }
            }
        }
        return new int[]{tt(win+zero), tt(win)};
    }
    private int tt(int win){
        switch(win){
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default : {
                return 6;
            }
        }
    }
}