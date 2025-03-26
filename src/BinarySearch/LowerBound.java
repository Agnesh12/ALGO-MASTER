package BinarySearch;

public class LowerBound {
    static int lower(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int ans = arr.length;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 7, 8};
        int target = 3;
        System.out.print(lower(arr, target));
    }
}
