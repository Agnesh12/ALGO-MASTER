package KadanesAlgorithm;

public class productmaxsubarray {
    static int product(int[] arr) {
        int max = 0;
        int suff = 1;
        int preff = 1;
        for(int i = 0; i< arr.length; i++) {
            if(suff == 0) {
                suff = 1;
            }
            if(preff == 0) {
                preff = 1;
            }
            preff = preff * arr[i];
            suff = suff * arr[arr.length - i - 1];
            max = Math.max(max, Math.max(suff, preff));
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5, 6};
        System.out.print(product(arr));
    }
}
