package BackTracking;

import java.util.ArrayList;

public class subset {
    static ArrayList<ArrayList<Integer>> findsub(int[] arr,ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans, int start) {
        ans.add(new ArrayList<>(temp));
        for(int i = start; i < arr.length; i++) {
            temp.add(arr[i]);
            findsub(arr, temp, ans, i + 1);
            temp.remove(temp.size() - 1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> ans = new ArrayList();
        System.out.print(findsub(arr,new ArrayList<>(), ans, 0));

    }
}
