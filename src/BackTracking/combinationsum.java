package BackTracking;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class combinationsum {
    static List<List<Integer>> backtracking(List<List<Integer>> ans, List<Integer> temp, int target, int[] arr, int start, int sum) {
        if(sum == target) {
            ans.add(new ArrayList<>(temp));
            return ans;
        }
        for(int i = 0; i < arr.length; i++) {
            if(sum + arr[i] > target) {
                break;
            }
            temp.add(arr[i]);
            backtracking(ans, temp, target, arr, i, sum + arr[i]);
            temp.remove(temp.size() - 1);

        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 6, 7};
        int target = 7;
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList();
        System.out.print(backtracking(ans, new ArrayList<>(), target, arr, 0, 0));
    }
}
