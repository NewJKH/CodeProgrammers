class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = 99;
        int rdx = 0;
        
        int luy = 99;
        int rdy = 0;
        for ( int i = 0 ; i< wallpaper.length; i++ ){
            String s = wallpaper[i];
            for ( int j = 0 ; j< s.length(); j++){
                if ( wallpaper[i].charAt(j) == '#' ){
                    lux = Math.min(j,lux);
                    luy = Math.min(i,luy);
                    
                    rdx = Math.max(rdx, i + 1);
                    rdy = Math.max(rdy, j + 1);
                }
            }
        }
        
        return new int[]{luy,lux,rdx,rdy};
    }
}