package String;

import java.util.HashMap;

public class validAnagram {
    static boolean isvalid(String str1, String str2) {
        HashMap<Character, Integer> hash1 = new HashMap();
        HashMap<Character, Integer> hash2 = new HashMap();
        if(str1.length() != str2.length()) {
            return false;
        }
        for(char num : str1.toCharArray()) {
            hash1.put(num, hash1.getOrDefault(num, 0) + 1);
        }
        for(char num : str2.toCharArray()) {
            hash2.put(num, hash2.getOrDefault(num, 0) + 1);
        }
        return hash1.equals(hash2);
    }
    public static void main(String[] args) {
        String str1 = "rat";
        String str2 = "tar";
        System.out.print(isvalid(str1, str2));
    }
}
