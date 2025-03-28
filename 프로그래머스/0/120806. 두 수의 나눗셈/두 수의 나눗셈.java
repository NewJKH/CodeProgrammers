class Solution {
    public int solution(double x, double y) {
        String n = filter(x,y);
        int v = Integer.valueOf(n);
        
        return (int) (x/y*1000);
    }
    static String filter(double x, double y){
         String n = String.valueOf(x/y*1000);
         return n.contains(".") ? n.split("\\.")[0] : n;
    }
}