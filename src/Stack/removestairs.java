package Stack;
import java.util.Stack;

public class removestairs {
    static String findresult(String ans) {
        Stack<Character> result =  new Stack();
        StringBuilder  find = new StringBuilder();
        for(char ch : ans.toCharArray()) {
            if(Character.isLetter(ch)) {
                result.push(ch);
            }
            else {
                result.pop();
            }
        }
        while(!result.isEmpty()) {
            find.append(result.pop());
        }
        return find.reverse().toString();

    }
    public static void main(String[] args) {
        String ans = "leet**code";
        System.out.print(findresult(ans));
    }
}
