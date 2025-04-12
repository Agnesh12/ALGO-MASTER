package SlidingWindow;

public class countNumberOfNiceSubarrays {
    static int SubArrays(int[] arr, int target) {
        int i = 0;
        int result = 0;
        for(int j = 0; j < arr.length; j++) {
            target -= arr[j] % 2;
            while(target < 0) {
                target += arr[i++] % 2;
            }
            result += j - i + 1;


        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 1, 1};
        int target = 3;
        int temp1 = SubArrays(arr, target);
       int temp2 = SubArrays(arr, target - 1);
        System.out.println(temp1 - temp2);
    }

}
