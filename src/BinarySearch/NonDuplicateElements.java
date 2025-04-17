package BinarySearch;

public class NonDuplicateElements {
    static int SearchElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(mid % 2 == 1) {
                mid--;
            }
            if(arr[mid] != arr[mid + 1]) {
                right = mid;
            }
            else {
                left = mid + 2;
            }
        }
        return arr[left];
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        System.out.print(SearchElement(arr));
    }
}
