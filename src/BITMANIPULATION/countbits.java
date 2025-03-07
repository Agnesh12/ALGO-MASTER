package BITMANIPULATION;
import java.util.Arrays;
public class countbits {
    static void print(int num) {
        int[] ans = new int[num + 1];
        ans[0] = 0;
        for(int i = 1; i <= num; i++) {
            int count = 0;
            int temp = i;
            while (temp > 0) {
                int rem = temp % 2;
                count += rem;
                temp /= 2;

            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args) {
        int num = 5;
        print(num);
    }
}
