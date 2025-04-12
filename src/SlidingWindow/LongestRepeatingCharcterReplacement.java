package SlidingWindow;

public class LongestRepeatingCharcterReplacement {
    static int Replacement(String str, int target) {
        int maxLength = 0;
        int max = 0;
        int left = 0;
        int frequency = 0;
        int mostChange = 0;
        int[] hash = new int[26];
        for(int right = 0; right < str.length(); right++) {
            hash[str.charAt(right) - 'A']++;
            frequency = Math.max(frequency, str.charAt(right));
            mostChange = right - left + 1 - frequency;
            while(mostChange > target) {
                hash[str.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;

    }
    public static void main(String[] args) {
        String str = "ABAB";
        int target = 2;
        System.out.print(Replacement(str, target));
    }
}
