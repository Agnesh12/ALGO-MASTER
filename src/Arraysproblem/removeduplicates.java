package Arraysproblem;
import java.util.Arrays;
public class removeduplicates {
    static void remove(int[] arr) {
        int[] ans = new int[arr.length];
        int temp = 0;
        ans[temp] = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i + 1]) {
                ans[temp++] = arr[i + 1];
            }
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4};
        remove(arr);
    }
}
