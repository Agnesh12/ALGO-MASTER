package Arraysproblem;

public class increaingtripletsubsequence {
     static boolean findsequence(int[] arr) {
         int small = Integer.MAX_VALUE;
         int big = Integer.MAX_VALUE;
         for(int num : arr) {
             if(num <= small) {
                 small = num;
             }
             else if(num <= big) {
                 big = num;
             }
             else {
                 return true;
             }
         }
         return false;
     }
    public static void main(String[] args) {
        int[] arr = {5, 7, 3, 8, 1};
        System.out.println(findsequence(arr));
    }
}
