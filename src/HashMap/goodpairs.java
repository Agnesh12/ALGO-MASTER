package HashMap;

import java.util.HashMap;

public class goodpairs {
    static int findgood(int[] arr) {
        int count = 0;
        HashMap<Integer, Integer> ans = new HashMap();
        for(int num : arr) {
            if(ans.containsKey(num)) {
                count += ans.get(num);
                ans.put(num, ans.get(num) + 1);
            }
            else {
                ans.put(num, 1);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.print(findgood(arr));
    }
}
