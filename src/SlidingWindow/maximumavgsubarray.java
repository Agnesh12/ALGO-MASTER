package SlidingWindow;

public class maximumavgsubarray {
    static double findavg(int[] arr, int slide) {
        int sum = 0;
        for(int i = 0; i < slide; i++) {
            sum += arr[i];
        }
        int max = sum;
        int index = 0;
        int temp = slide;
        while(temp < arr.length) {
            sum -= arr[index++];
            sum += arr[temp++];
            max = Math.max(max, sum);
        }
        return (double) max / 2;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7};
        int slide= 4;
        System.out.print(findavg(arr, slide));
    }
}
