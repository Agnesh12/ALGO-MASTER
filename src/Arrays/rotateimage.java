package Arrays;
import java.util.Arrays;
public class rotateimage {
    static void reverse(int[] arr, int start, int end) {
        while(start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotate(int[] arr, int k) {
        int rot  = k % arr.length;
        reverse(arr, 0, arr.length - rot - 1);
        reverse(arr, arr.length - rot, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        rotate(arr, k);
    }
}
