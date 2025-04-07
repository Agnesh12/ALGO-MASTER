package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagram {
    static List<Integer> find(String str1, String str2) {
        int[] phash = new int[26];
        int[] shash = new int[26];
        List<Integer> ans = new ArrayList();
        for(char num : str2.toCharArray()) {
            phash[num - 'a']++;
        }
        int start = 0;
        for(int end = 0; end < str1.length(); end++) {
            char ch = str1.charAt(end);
            shash[ch - 'a']++;
            if(end >= str2.length() - 1) {
                if(Arrays.equals(shash, phash)) {
                    ans.add(start);
                }
                shash[str1.charAt(start) - 'a']--;
                start++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str1 = "abcabcabc";
        String str2 = "abc";
        System.out.print(find(str1, str2));
    }
}
