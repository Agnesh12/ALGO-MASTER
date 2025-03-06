package String;
import java.util.Arrays;
public class longestcommonprefix {
    static void check(String[] arr) {
        StringBuffer ans = new StringBuffer();
        Arrays.sort(arr);
        char[] first = arr[0].toCharArray();
        char[] last = arr[arr.length - 1].toCharArray();
        for(int i = 0; i < first.length; i++) {
            if(first[i] != last[i]) {
                break;
            }
            else {
                ans.append(first[i]);
            }
        }
        System.out.println(ans.toString());
    }
    public static void main(String[] args) {
        String[] arr = {"flower", "flight", "flip"};
        check(arr);
    }
}
