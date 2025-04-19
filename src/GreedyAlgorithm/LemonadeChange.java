package GreedyAlgorithm;

public class LemonadeChange {
    static boolean Change(int[] arr) {
        int Five = 0;
        int Ten = 0;
        int Twenty = 0;
        for(int num : arr) {
            if(num == 5) {
                Five++;
            }
            else if(num == 10){
                if(Five > 0) {
                    Five--;
                    Ten++;
                }
                else {
                    return false;
                }
            }
            else {
                if(Five > 0 && Ten > 0) {
                    Five--;
                    Ten--;

                }
                else if(Five > 2) {
                    Five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5, 5, 10, 20, 5, 5, 20};
        System.out.print(Change(arr));
    }
}
