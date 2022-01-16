package ProgrammingChallenges.Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem2 {
	static int[] dirX = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dirY = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int n = 0, m = 0, field = 1;
		char[][] board = null;
		int[][] arr = null;
		
		while(true) {
			tmp = br.readLine();
			n = Integer.parseInt(tmp.split(" ")[0]);
			m = Integer.parseInt(tmp.split(" ")[1]);
			if (n == 0 && m == 0) break;
			
			board = new char[n+2][m+2];
			arr = new int[n+2][m+2];
			
			for (int i = 1; i <= n; i++) {
				tmp = br.readLine();
				for (int j = 1; j <= m; j++) {
					board[i][j] = tmp.charAt(j-1);
					if (board[i][j] == '*') {
						for (int k = 0; k < dirX.length; k++) {
							arr[i+dirX[k]][j+dirY[k]]++;
						}
					}
				}
			}
			sb.append("Field #" + (field++) + ":\n");
			for (int i = 1; i < arr.length-1; i++) {
				for (int j = 1; j < arr[i].length-1; j++) {
					if (board[i][j] == '*') sb.append('*');
					else sb.append(arr[i][j]);
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
