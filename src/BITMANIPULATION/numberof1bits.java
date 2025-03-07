package BITMANIPULATION;

public class numberof1bits {
    static int findcount(int num) {
        int count  = 0;
        while(num != 0) {
            int rem = num % 2;
            count += rem;
            num /= 2;
        }
        return count;
    }
    public static void main(String[] args) {
        int num = 11;
        System.out.print(findcount(num));
    }
}
