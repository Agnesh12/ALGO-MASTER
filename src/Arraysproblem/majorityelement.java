package Arraysproblem;

public class majorityelement {
    static void major(int[] arr) {
        int count  = 0;
        int element = 0;
         for(int i = 0; i < arr.length; i++) {
             if(count == 0) {
                 count = 1;
                 element = arr[i];
             }
             else if(arr[i] == element) {
                 count++;
             }
             else {
                 count--;
             }
         }
         int count1 = 0;
         for(int i = 0; i < arr.length; i++) {
             if(arr[i] == element) {
                 count1++;
             }
         }
         if(count1 > arr.length / 2) {
             System.out.println(element);
         }
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2};
        major(arr);
    }
}
