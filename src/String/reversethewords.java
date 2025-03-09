package String;

public class reversethewords {
    static void findwords(String s) {
        String[] str = s.trim().split("\s");
        String ans = "";
        for(int i = str.length - 1; i > 0; i--) {
            ans += str[i] + " ";
        }
        System.out.println(ans + str[0]);
    }
    public static void main(String[] args) {
        String s = "The Sky is Blue";
        findwords(s);
    }
}
