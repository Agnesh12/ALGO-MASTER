package BinarySearch;

public class searchInaRotatedSortedArray2 {
    static boolean findTarget(int[] arr, int target) {
        int start = 0;
         int end = arr.length - 1;
         while(start <= end) {
             int mid = start + (end - start) / 2;
             if(arr[mid] == target) {
                 return true;
             }
             if(arr[mid] == arr[start]) {
                 start++;
                 continue;
             }
             if(arr[start] <= arr[mid]) {
                 if(target >= arr[start] && target < arr[mid]) {
                     end = mid - 1;
                 }
                 else {
                     start = mid + 1;
                 }
             }
             else {
                 if(target > arr[mid] && target <= arr[end]) {
                     start = mid + 1;
                 }
                 else {
                     end = mid - 1;
                 }
             }
         }
         return false;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.print(findTarget(arr, target));
    }
}
