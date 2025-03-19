package Recursion;
import java.util.ArrayList;
public class findparanthesis {
    static ArrayList<String> back(ArrayList<String> ans, int open, int close,String str, int num) {
        if(num * 2 == str.length()) {
            ans.add(str);
            return ans;
        }
        if(open < num) {
            back(ans, open + 1, close, str + '(', num);
        }
        if(open > close) {
            back(ans, open, close + 1, str + ')', num);
        }
        return ans;
    }
    public static void main(String[] args) {
        int num = 2;
        String result = "";
        ArrayList<String> ans = new ArrayList<>();
        System.out.print(back(ans, 0, 0,result, num));
    }
}
