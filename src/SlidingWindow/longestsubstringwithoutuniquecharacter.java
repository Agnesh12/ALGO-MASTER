package SlidingWindow;

import java.util.HashMap;

public class longestsubstringwithoutuniquecharacter {
    static int findsubstring(String ch) {
        HashMap<Character, Integer> ans = new HashMap();
        int left = 0;
        int right = 0;
        int len = 0;
        int n = ch.length();
        while(right < n) {
            if(ans.containsKey(ch.charAt(right))) {
                left = Math.max(ans.get(ch.charAt(right)) + 1, left);

            }
            ans.put(ch.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        String ch = "loveleetcode";
        System.out.print(findsubstring(ch));
    }
}
