package String;

public class Zigzagconversion {
    static void findzigzag(String zig, int num) {
        if(num == 1) {
            System.out.println(zig);
        }
        StringBuffer[] ans = new StringBuffer[num];
        for(int i = 0; i < num; i++) {
            ans[i] = new StringBuffer();
        }
        int current = 0;
        boolean down = false;
        for(char c : zig.toCharArray()) {
            ans[current].append(c);
            if(current == 0 || current == num - 1) {
                down = !down;
            }
            current += down ? 1 : -1;
        }
        StringBuffer result = new StringBuffer();
        for(StringBuffer res : ans) {
            result.append(res);
        }
        System.out.println(result.toString());
    }
    public static void main(String[] args) {
        String zig = "PAYPALISHIRING";
        int row = 3;
        findzigzag(zig, row);
    }
}
