package Stack;

public class validparanthesisString {
    static boolean isValid(String str) {
        int leftMin = 0;
        int leftMax = 0;
        for(char ch : str.toCharArray()) {
            if(ch == '(') {
                leftMin++;
                leftMax++;
            }
            else if(ch == ')') {
                leftMin--;
                leftMax--;
            }
            else {
                leftMin--;
                leftMax++;
            }
            if(leftMax < 0) return false;
            if(leftMin < 0) leftMin = 0;
        }
        return leftMin == 0;
    }
    public static void main(String[] args) {
        String str = "(**)";
        System.out.print(isValid(str));
    }
}
