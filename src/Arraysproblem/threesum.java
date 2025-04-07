package Arraysproblem;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class threesum {
    static void findallsum(int[] arr) {
        List<List<Integer>> ans = new ArrayList();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
          int j = i + 1;
            int k = arr.length - 1;
            while(j < k) {
                sum = arr[i] + arr[j] + arr[k];
                if(sum < 0) {
                    j++;
                }
                else if( sum > 0) {
                    k--;
                }
                else {
                    ans.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j - 1]) {
                        j++;
                    }
                    while(j < k && arr[k] == arr[k + 1]) {
                        k--;
                    }
                }
            }


        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 2, -2, 0, 1};
        findallsum(arr);
    }
}
