package HashMap;
import java.util.HashMap;
public class maximumballooons {
    static int findballoon(String ball) {
        int min = Integer.MAX_VALUE;
        HashMap<Character, Integer> ans = new HashMap();
        for(char val : ball.toCharArray()) {
           ans.put(val, ans.getOrDefault(ans.get(val), 0) + 1);
        }
        min = Math.min(min, ans.getOrDefault('b', 0));
        min = Math.min(min, ans.getOrDefault('a', 0));
        min = Math.min(min, ans.getOrDefault('l', 0) / 2);
        min = Math.min(min, ans.getOrDefault('o', 0) / 2);
        min = Math.min(min, ans.getOrDefault('n', 0));
        return min;
    }
    public static void main(String[] args) {
        String ball = "nlaebolko";
        System.out.print(findballoon(ball));
    }
}
