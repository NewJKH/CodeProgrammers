import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int gcd = 최대공약수(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    public int 최대공약수(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}