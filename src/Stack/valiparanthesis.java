package Stack;
import java.util.Stack;
public class valiparanthesis {
    static boolean valid(String str) {
        Stack<Character> ans = new Stack();
        for(char ch : str.toCharArray()) {
            if (ch == '(') {
                ans.push(')');
            } else if (ch == '[') {
                ans.push(']');
            } else if (ch == '{') {
                ans.push('}');
            } else if (ans.isEmpty() || ans.pop() != ch) {
                return false;
            }
        }
            return ans.isEmpty();
    }
    public static void main(String[] args) {
        String str = "(){}[]";
        System.out.print(valid(str));
    }
}
