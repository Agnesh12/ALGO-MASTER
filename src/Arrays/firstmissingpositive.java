package Arrays;

public class firstmissingpositive {
    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    static int findmissing(int[] arr) {
        int i = 0;
        int n = arr.length;
        while(i < n) {
            int current = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= n && arr[i] != arr[current]) {
                swap(arr, i, current);
            }
            else {
                i++;
            }
        }
        for( i = 0; i < arr.length; i++) {
            if(arr[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.print(findmissing(arr));
    }
}
