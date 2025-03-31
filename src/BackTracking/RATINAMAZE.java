package BackTracking;
import java.util.ArrayList;
public class RATINAMAZE {
    static ArrayList<String> escaperoot(int[][] matrix, int[][] visited, ArrayList<String> ans, String str, int len, int row, int col) {
        if(row == len - 1 && col == len - 1) {
            ans.add(str);
            return ans;
        }
        if(row + 1 < len && visited[row + 1][col] == 0 && matrix[row + 1][col] == 1) {
            visited[row + 1][col] = 1;
            escaperoot(matrix, visited, ans, str + 'D', len, row + 1, col);
            visited[row + 1][col] = 0;
        }
        if(col - 1 >= 0 && visited[row][col - 1] == 0 && matrix[row][col - 1] == 1) {
            visited[row][col - 1] = 1;
            escaperoot(matrix, visited, ans, str + 'L', len, row, col - 1);
            visited[row][col - 1] = 0;
        }
        if(row - 1 >= 0 && visited[row - 1][col] == 0 && matrix[row - 1][col] == 1) {
            visited[row - 1][col] = 1;
            escaperoot(matrix, visited, ans, str + 'U', len, row - 1, col);
            visited[row - 1][col] = 0;
        }
        if(col + 1 < len && visited[row][col + 1] == 0 && matrix[row][col + 1] == 1) {
            visited[row][col + 1] = 1;
            escaperoot(matrix, visited, ans, str + 'R', len, row, col + 1);
            visited[row][col + 1] = 0;
        }
        return ans;
    }
    public static void main(String[] args) {
    int[][] matrix = {{1, 0, 0, 0}, {1, 1, 0, 0}, {1, 1, 0, 0}, {1, 1, 1, 1}};
    int[][] visited = new int[matrix.length][matrix.length];
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix.length; j++) {
            visited[i][j] = 0;
        }
    }

    ArrayList<String> temp = new ArrayList();
    int len = matrix.length;
    System.out.print(escaperoot(matrix, visited, temp, "", len, 0, 0));
    }
}
