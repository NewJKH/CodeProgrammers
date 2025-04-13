class Solution {
    public int[] solution(int money) {
        int PRICE = 5500;
        return new int[]{getX(PRICE, money),getY(PRICE, money)};
    }
    
    public int getX(int PRICE, int money){
        int x = 0;
        while(true){
            if ( PRICE <= money ){
                x++;
                money-=PRICE;
            }else break;
        }
        return x;
    }
    
    public int getY(int PRICE, int money){
        return money%5500;
    }
}