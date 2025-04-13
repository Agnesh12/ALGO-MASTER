package Stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    static int[] Temperature(int[] arr) {
        Stack<Integer> ans = new Stack();
        int index = 0;
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while(!ans.isEmpty() && arr[i] > arr[ans.peek()]) {
                index = ans.pop();
                result[index] = i - index;
            }
            ans.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {10, 11, 9, 13, 15, 7, 16};
        System.out.print(Arrays.toString(Temperature(arr)));
    }
}
