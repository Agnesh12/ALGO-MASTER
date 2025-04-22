package GreedyAlgorithm;

public class CandyRating {
    static int Rating(int[] arr) {
        int i = 1;
        int len = arr.length;
        int TotalCandies = len;
        while(i < len) {
            if(arr[i] == arr[i - 1]) {
                i++;
                continue;
            }
            int CurrentPeak = 0;
            while(i < len && arr[i] > arr[i - 1]) {
                CurrentPeak++;
                TotalCandies += CurrentPeak;
                i++;
            }
            if(i == len) {
                return TotalCandies;
            }
            int CurrentValley = 0;
            while(i < len && arr[i] < arr[i -1]) {
                CurrentValley++;
                TotalCandies += CurrentValley;
                i++;
            }
            TotalCandies -= Math.min(CurrentPeak, CurrentValley);
        }
        return TotalCandies;
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 2};
         System.out.print(Rating(arr));
    }

}
