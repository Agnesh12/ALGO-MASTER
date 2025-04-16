package BinarySearch;

public class searchInaRotatedSortedArray {
    static int Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
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
                if(target > arr[mid] && arr[end] >= target) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.print(Search(arr, target));
    }
}
