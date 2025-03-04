package Arrays;
import java.util.Arrays;
public class arraysexceptitself {
    static void result(int[] arr) {
        int[] arr1 = new int[arr.length];
        int[] arr2 = new int[arr.length];
        arr1[0] = 1;
        for(int i = 1; i < arr.length; i++) {
            arr1[i] = arr1[i - 1] * arr[i - 1];
        }
        arr2[arr.length - 1] = 1;
        for(int i = arr.length - 2; i >= 0; i--) {
            arr2[i] = arr2[i + 1]  * arr[i + 1];
        }
        int[] ans = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            ans[i] = arr1[i] * arr2[i];
        }
        System.out.print(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        result(arr);
    }
}
