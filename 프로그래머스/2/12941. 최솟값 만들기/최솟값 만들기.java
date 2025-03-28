import java.util.Arrays;

class Solution{
    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B); 

        int sum = 0;
        int length = A.length;

        for (int i = 0; i < length; i++) {
            sum += A[i] * B[length - 1 - i];
        }

        return sum;
    }
    /* 이건 왜 안되는거지 ? */
    /*
class Solution{
    public int solution(int[] A, int[] B) {
        int sum = 0;
        int count = A.length;

        for (int i = 0; i < count; i++) {
            int min = extractMin(A);
            int max = extractMax(B);

            sum += min * max;
        }
        return sum;
    }
    
    private int extractMin(int[] A) {
        int minIndex = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] < A[minIndex]) {
                minIndex = i;
            }
        }

        int minValue = A[minIndex];
        A[minIndex] = 1000;

        return minValue;
    }
    
    private int extractMax(int[] B) {
        int maxIndex = 0;

        for (int i = 1; i < B.length; i++) {
            if (B[i] > B[maxIndex]) {
                maxIndex = i;
            }
        }

        int maxValue = B[maxIndex];
        B[maxIndex] = 0;

        return maxValue;
    }
}
    */
    /* 이건 또 왜 안되는거지 ?*/
/*
class Solution{
    public int solution(int[] A, int[] B) {
        selectionSort(A, true);  // A 배열을 오름차순 정렬
        selectionSort(B, false); // B 배열을 내림차순 정렬

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i] * B[i];
        }

        return sum;
    }
    
    public void selectionSort(int[] arr, boolean ascending) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int idx = i;

            for (int j = i + 1; j < length; j++) {
                if ((ascending && arr[j] < arr[idx]) || (!ascending && arr[j] > arr[idx])) {
                    idx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
    }
}
*/
}