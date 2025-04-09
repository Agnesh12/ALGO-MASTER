package Arraysproblem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TopkfrequentElements {
    static int[] findTopK(int[] arr, int len) {

        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        HashMap<Integer, Integer> result = new HashMap();
        for(int num : arr) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }
        for(int key : result.keySet()) {
            int frequency = result.get(key);
            if(bucket[frequency] == null) {
                bucket[frequency] = new ArrayList();
            }
            bucket[frequency].add(key);
        }
        int counter = 0;
        int[] ans = new int[len];
        for(int pos = bucket.length - 1; pos >= 0 && counter < len; pos--) {
            if(bucket[pos] != null) {
                for(Integer integer : bucket[pos]) {
                    ans[counter++] = integer;
                }
                if(counter == len) {
                    break;
                }
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = 2;
        int[] result = findTopK(arr, k);
        System.out.println(Arrays.toString(result));
    }
}
