package String;

public class subsequence {
    static boolean sub(String a, String b) {
        int low = 0;
        int mid = 0;
        while (low < a.length() && mid < b.length()) {
            if (a.charAt(low) == b.charAt(mid)) {
                low++;
                mid++;
            } else {
                mid++;
            }
        }
        return (low == a.length());
    }

    public static void main(String[] args) {
        String a = "abc";
        String b = "adbec";
        System.out.print(sub(a, b));
    }
}

