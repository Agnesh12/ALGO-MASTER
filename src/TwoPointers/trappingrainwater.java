package TwoPointers;

public class trappingrainwater {
    static int findtrap(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int lmax = 0;
        int rmax = 0;
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            lmax = Math.max(lmax, arr[i]);
            left[i] = lmax;
        }
        for(int i = arr.length - 1; i >= 0; i--) {
            rmax = Math.max(rmax, arr[i]);
            right[i] = rmax;
        }
        for(int i = 0;i < arr.length; i++) {
            sum += Math.min(left[i], right[i]) - arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0 , 1, 3, 2, 1, 2, 1};
        System.out.print(findtrap(arr));
    }
}
