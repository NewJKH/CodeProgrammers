class Solution {
      
    public String solution(int[] food) {
        StringBuilder stringBuilder = new StringBuilder();

        for ( int i = 1; i < food.length; i++){
            int f = food[i];
            for ( int j = f-2; j >= 0; j-=2){
                stringBuilder.append(i);
            }
        }
        String sort = new StringBuilder(stringBuilder).reverse().toString();
        stringBuilder.append(0);
        stringBuilder.append(sort);
        return stringBuilder.toString();
    }
}