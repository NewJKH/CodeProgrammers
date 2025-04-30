import java.util.*;

class Solution {
    /*
        brown + yellow 는 총 칸 갯수 ( 10 + 2 = ex 12 칸 )
        x * y = 12
            ( x >= y ) 조건 ( 일단 약수를 구해야 하고.. )
        x 4 y 3 
        x 6 y 2
        x 12 y 1
        ( 여기서 y 축은 1 ~ 2 가 되면 반드시 yellow 가 0 임 )
        이렇게 구해진 것들을 탐색
        노란색을 구혀려면 x - 2 y - 2
        갯수랑 일치하다면 OK
    */
    public int[] solution(int brown, int yellow) {

        List<Tuple<Integer,Integer>> list = divisors(brown+yellow);
        for (Tuple<Integer, Integer> tuple : list) {
            int x = tuple.getX();
            int y = tuple.getY();

            int inner = (x - 2) * (y - 2);
            if (inner == yellow) {
                return new int[]{x, y};
            }
        }
        return new int[0];
    }

    private List<Tuple<Integer,Integer>> divisors(int n){
        List<Tuple<Integer,Integer>> list = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                int x = n/i;
                int y = i;
                if ( x < y ) break;
                list.add(new Tuple<>(x,y));
            }
        }
        return list;
    }

    private class Tuple<X,Y>{
        private int x;
        private int y;

        public Tuple(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }
}