package BackTracking;
import java.util.ArrayList;
public class permutation {
    static ArrayList<ArrayList<Integer>> backtrack(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> result,int[] arr) {
        if(result.size() == arr.length) {
            ans.add(new ArrayList<>(result));
            return ans;
        }
        for(int num : arr) {
            if(result.contains(num))
                continue;
            result.add(num);
            backtrack(ans, result, arr);
            result.remove(result.size() - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print(backtrack(ans, result,arr));
    }

}
