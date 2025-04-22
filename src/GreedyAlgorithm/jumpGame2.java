package GreedyAlgorithm;

public class jumpGame2 {
    static int findJumps(int[] arr) {
        int near = 0;
        int far = 0;
        int jumps = 0;
        while(far < (arr.length - 1)) {
            int farthest = 0;
            for(int i = near; i <= far; i++) {
                farthest = Math.max(farthest, i + arr[i]);

            }
            near = far + 1;
            far = farthest;
            jumps++;
        }
        return jumps;
    }
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 3, 1, 2, 1};
        System.out.print(findJumps(arr));
    }
}
