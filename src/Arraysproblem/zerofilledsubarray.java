package Arraysproblem;

public class zerofilledsubarray {
    static int findcount(int[] arr, int count, int num) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                num++;
            }
            else {
                count += (num * (num + 1)) / 2;
                num = 0;
            }
        }
        if(num > 0) {
            count += (num * (num + 1)) / 2;
        }
        return count;
    }
    public static void main(String[] args) {
        int count = 0;
        int num = 0;
        int[] arr = {1, 2, 0, 0, 4, 0, 0, 0};
        int result = findcount(arr, count, num);
        System.out.println(result);
    }
}
