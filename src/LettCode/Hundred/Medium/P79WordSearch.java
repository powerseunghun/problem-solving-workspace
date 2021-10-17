package LettCode.Hundred.Medium;

import java.util.Arrays;

public class P79WordSearch {
    static boolean[][] check = null;
    static int[] dirX = {0, -1, 0, 1};
    static int[] dirY = {-1, 0, 1, 0};
    static boolean flag = false;
    static void checkInit() {
		for (int i = 0; i < check.length; i++) {
			Arrays.fill(check[i], false);
		}
	}
    static void dfs(int x, int y, String str, char[][] board, String target) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != target.charAt(i)) {
				return;
			}
		}
		str += board[x][y];
		if (target.equals(str)) {
            flag = true;
			return;
		}
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			
			if (nx < 0 || ny < 0 || nx > board.length-1 || ny > board[nx].length-1) continue;
			if (!check[nx][ny]) {
				check[nx][ny] = true;
				dfs(nx, ny, str, board, target);
				check[nx][ny] = false;
			}
		}
	}
    static boolean exist(char[][] board, String word) {
        flag = false;
        check = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                checkInit();
                check[i][j] = true;
                dfs(i, j, "", board, word);
            }
        }
        return flag;
    }
    public static void main(String[] args) {
//    	System.out.println(exist(board, word));
	}
}
