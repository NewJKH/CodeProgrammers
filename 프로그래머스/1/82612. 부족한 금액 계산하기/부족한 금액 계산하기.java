class Solution {
    public long solution(int price, int money, int count) {
        long total = getTotalPrice(price,count);
        return money < total ? -(money-total) : 0;
    }
    private long getTotalPrice(long price, int count){
        long total = 0;
        for ( int i = 0; i<=count;i++){
            total += price * i;
        }
        return total;
    }
}