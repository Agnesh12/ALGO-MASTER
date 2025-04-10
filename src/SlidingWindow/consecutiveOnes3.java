package SlidingWindow;

public class consecutiveOnes3 {
    static int consecutive(int[] arr, int target) {
        int start = 0;
        int max = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            }
            while(count > target) {
                if(arr[start] == 0) {
                    count--;
                }
                start++;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        System.out.print(consecutive(arr, k));
    }
}
