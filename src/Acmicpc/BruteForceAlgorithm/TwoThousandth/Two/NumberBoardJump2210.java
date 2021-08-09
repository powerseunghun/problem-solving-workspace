package Acmicpc.BruteForceAlgorithm.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;

public class NumberBoardJump2210 {
	static char[][] board = new char[5][5];
	static char[] arr = new char[6];
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static Set<String> set = new HashSet<>();
	static void dfs(int n, int d, int x, int y) {
		if (d >= n) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
			}
			set.add(sb.toString());
			return;
		}
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			
			if (nx < 0 || ny < 0 || nx > (board.length-1) || ny > (board[nx].length-1)) continue;
			
			arr[d] = board[x][y];
			dfs(n, d+1, nx, ny);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		for (int i = 0; i < board.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < board[i].length; j++) {
				board[i][j] = st.nextToken().charAt(0);
			}
		}
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				dfs(6, 0, i, j);
			}
		}
		System.out.println(set.size());
	}
}
