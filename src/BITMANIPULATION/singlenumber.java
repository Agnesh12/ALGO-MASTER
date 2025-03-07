package BITMANIPULATION;

public class singlenumber {
    static int findsingle(int[] arr) {
        int xor = 0;
        for(int i = 0; i < arr.length; i++) {
            xor ^= arr[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 5};
        System.out.print(findsingle(arr));
    }
}
