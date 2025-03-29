package Arraysproblem;

public class movezeros {
    static void zeros(int[] arr) {
        int left = 0;
        int mid = 0;
        int right = arr.length - 1;
         while(mid <= right) {
             if(arr[mid] != 0) {
                 int temp = arr[mid];
                 arr[mid] = arr[left];
                 arr[left] = temp;
                 left++;
                 mid++;
             }
             else{
                 mid++;
             }

         }

    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 5, 6};
        zeros(arr);
    }
}
