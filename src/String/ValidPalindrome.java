package String;

public class ValidPalindrome {
    static boolean valid(String pal) {
        int start = 0;
        int end  = pal.length() - 1;
        if(pal.isEmpty()) {
            return true;
        }
        while(start <= end) {
            char firstchar = pal.charAt(start);
            char lastchar = pal.charAt(end);
            if(!Character.isLetterOrDigit(firstchar)) {
                start++;
            }
            else if(!Character.isLetterOrDigit(lastchar)) {
                end--;
            }
            else {
                if(Character.toLowerCase(firstchar) != Character.toLowerCase(lastchar)) {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pal = "A man, a plan, a canal: Panama";
        System.out.println(valid(pal));
    }
}
