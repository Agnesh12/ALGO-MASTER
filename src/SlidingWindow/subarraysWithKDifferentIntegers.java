package SlidingWindow;

import java.util.HashMap;

public class subarraysWithKDifferentIntegers {
    static int Distinct(int[] arr, int target) {
        int right= 0;
        int left = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap();
        while(right < arr.length) {
           map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);
           while(map.size() > target) {
               map.put(arr[left], map.get(arr[left]) - 1);
               if (map.get(arr[left]) == 0) {
                   map.remove(arr[left]);

               }
               left++;
           }
           ans += right - left + 1;
           right++;

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int target = 2;
        int maxsum = Distinct(arr, target);
        int reducesum = Distinct(arr, target - 1);
        System.out.print(maxsum - reducesum);
    }
}
