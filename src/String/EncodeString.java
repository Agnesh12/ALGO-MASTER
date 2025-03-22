package String;

import java.util.Stack;

public class EncodeString {
    static String encode(String str) {
        String result = "";
        Stack<Integer> num = new Stack<>();
        Stack<String> letter = new Stack<>();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                // Convert character to number and push to the stack
               count = count * 10 + Character.getNumericValue(ch);
            }
            else if (ch == '[') {
                // Push the current result to the stack and reset it
                num.push(count);
                count = 0;
                letter.push(result);
                result = "";
            }
            else if (ch == ']') {
                // Pop the string from the stack and combine with the current result
                String temp = letter.pop();
                int repeatcount = num.pop();
                StringBuilder sb = new StringBuilder(temp);
                for (int i = 0; i < repeatcount; i++) {
                    sb.append(result);
                }
                result = sb.toString();
            } else {
                // Append the current character to the result
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "3[b2[c]]";
        System.out.print(encode(str));
    }
}

