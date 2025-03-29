package Arraysproblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class foursum {
  static void findsum(int[] arr, int target) {
      List<List<Integer>> ans = new ArrayList();
      int sum = 0;
      for (int i = 0; i < arr.length - 2; i++) {
          if (i != 0 && arr[i] == arr[i - 1]) {
              continue;
          }
          for (int j = i + 1; j < arr.length - 1; j++) {
              if (j > i + 1 && arr[j] == arr[j - 1]) {
                  continue;
              }
              int k = j + 1;
              int l = arr.length - 1;
              while (k < l) {
                  sum = arr[i] + arr[j] + arr[k] + arr[l];
                  if (sum == target) {
                      ans.add(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));
                      k++;
                      l--;
                      while (l < k && arr[k] == arr[k - 1]) {
                          k++;
                      }
                      while (l < k && arr[l] == arr[l + 1]) {
                          l--;
                      }
                  } else if (sum < target) {
                      k++;
                  } else {
                      l--;
                  }
              }
          }
      }
      System.out.println(ans);
  }
    public static void main(String[] args) {
        int[] arr = {2, 2, 4, 0, 0, 4};
        int target = 8;
        findsum(arr, target);
    }
}
