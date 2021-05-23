package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainCrazyArcade2708 {
	static int x2 = 0, y2 = 0;
	static char dir = 'n';
	static int cnt = 0;
	static void checkLeft(int x, int y, int[][] board) {
		for (int i = x-1; i > 0; i--) {
			if (board[y][i] == 0) cnt++;
			else if (board[y][i] == 1) return;
			else {
				x2 = i; 
				y2 = y;
				dir = 'l';
				break;
			}
		}
	}
	static void checkRight(int x, int y, int[][] board) {
		for (int i = x+1; i < board.length-1; i++) {
			if (board[y][i] == 0) cnt++;
			else if (board[y][i] == 1) return;
			else {
				x2 = i; 
				y2 = y;
				dir = 'r';
				return;
			}
		}
	}
	static void checkDown(int x, int y, int[][] board) {
		for (int i = y+1; i < board.length-1; i++) {
			if (board[i][x] == 0) cnt++;
			else if (board[i][x] == 1) return;
			else {
				x2 = x;
				y2 = i;
				dir = 'd';
				return;
			}
		}
	}
	static void checkUp(int x, int y, int[][] board) {
		for (int i = y-1; i > 0; i--) {
			if (board[i][x] == 0) cnt++;
			else if (board[i][x] == 1) return;
			else {
				x2 = x;
				y2 = i;
				dir = 'u';
				return;
			}
		}
	}
	static void bang(int x, int y, int[][] board) {
		if (board[y][x] != 0) return;
		else if (board[y][x] == 0) {
			checkLeft(x, y, board);
			checkRight(x, y, board);
			checkDown(x, y, board);
			checkUp(x, y, board);
			return;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		if (N == 1) {
		    System.out.println("0");
		    return;
		}
		int[][] board = new int[N+2][N+2];
		
		String tmp = br.readLine();
		int x = Integer.parseInt(tmp.split(" ")[0]);
		int y = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 1; i < board.length-1; i++) {
			tmp = br.readLine();
			for (int j = 1; j < board[i].length-1; j++) {
				board[i][j] = Integer.parseInt(tmp.split(" ")[j-1]);
			}
		}
		bang(x, y, board);
		if (dir != 'n' && x2 != 0 && y2 != 0) {
			switch(dir) {
			case 'l':
				checkLeft(x2, y2, board);
				checkUp(x2, y2, board);
				checkDown(x2, y2, board);
				break;
			case 'r':
				checkRight(x2, y2, board);
				checkUp(x2, y2, board);
				checkDown(x2, y2, board);
				break;
			case 'u':
				checkUp(x2, y2, board);
				checkLeft(x2, y2, board);
				checkRight(x2, y2, board);
				break;
			case 'd':
				checkDown(x2, y2, board);
				checkLeft(x2, y2, board);
				checkRight(x2, y2, board);
				break;
			}
		}
		System.out.println(cnt);
	}
}