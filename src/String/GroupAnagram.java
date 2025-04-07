package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    static String getFrequency(String num) {
        int[] hash = new int[26];
        for(char c : num.toCharArray()) {
            hash[c - 'a']++;
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            if(hash[i] > 0) {
                ans.append((char) (i + 'a')).append(hash[i]);
            }
        }
        return ans.toString();
    }
    static List<List<String>> findanagram(String[] arr) {
        HashMap<String, List<String>> ans = new HashMap();
        for(String num : arr) {
            String frequency = getFrequency(num);
            if(ans.containsKey(frequency)) {
                ans.get(frequency).add(num);
            }
            else {
                List<String> temp = new ArrayList();
                temp.add(num);
                ans.put(frequency,temp);
            }
        }
        return new ArrayList<>(ans.values());
    }
    public static void main(String[] args) {
        String[] arr = {"eat", "ate", "tea", "ben", "tan"};
        System.out.print(findanagram(arr));
    }
}
