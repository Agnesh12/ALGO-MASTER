package Arraysproblem;

public class MedianOfTwoSortedArray {
    static double findMedian(int[] arr1, int[] arr2) {
        int arr1len = arr1.length;
        int arr2len = arr2.length;
        int[] ans = new int[arr1len + arr2len];
        double result = 0;
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < arr1len && j < arr2len) {
            if(arr1[i] < arr2[j]) {
                ans[k++] = arr1[i++];
            }
            else {
                ans[k++] = arr2[j++];
            }
        }
        while(i < arr1len) {
            ans[k++] = arr1[i++];
        }
        while(j < arr2len) {
            ans[k++] = arr2[j++];
        }
        if((arr1len + arr2len) % 2 == 0) {
            result = ans[(arr1len + arr2len) / 2] + ans[(arr1len + arr2len) / 2 - 1] / 2.00;
        }
        else {
            result = ans[(arr1len + arr2len) / 2];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 4, 5};
        System.out.print(findMedian(arr1, arr2));
    }
}
