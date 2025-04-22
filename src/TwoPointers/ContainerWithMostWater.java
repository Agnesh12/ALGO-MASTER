package TwoPointers;

public class ContainerWithMostWater {
    static int MostWater(int[] arr) {
        int left = 0;
         int right = arr.length - 1;
         int MaxContainer = 0;
         while(left < right) {
             int AreaContainer = Math.min(arr[right], arr[left]) * (right - left);
             MaxContainer = Math.max(MaxContainer, AreaContainer);
             if(arr[left] < arr[right]) {
                 left++;
             }
             else {
                 right--;
             }
         }
         return MaxContainer;
    }
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 9};
        System.out.print(MostWater(arr));
    }
}
