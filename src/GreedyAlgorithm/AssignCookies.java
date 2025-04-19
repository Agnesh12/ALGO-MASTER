package GreedyAlgorithm;

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 3};
        int[] cookies = {1, 2, 3};
        int Result = 0;
        int Fstart = 0;
        int Sstart = 0;
        Arrays.sort(arr);
        Arrays.sort(cookies);
        while(Fstart < arr.length && Sstart < cookies.length) {
            if(arr[Fstart] <= cookies[Sstart]) {
                Fstart++;
                Sstart++;
                Result++;
            }
            else {
                Sstart++;
            }
        }
        System.out.println(Result);
    }
}
