package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Game1103 {
	static int[][] arr = null;
	static int[][] dp = null;
	static boolean[][] check = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int res = Integer.MIN_VALUE;
	static boolean cycle = false;
	static void dfs(int x, int y, int time) {
		res = Math.max(time, res);
		dp[x][y] = time;
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + (dirX[i] * arr[x][y]);
			ny = y + (dirY[i] * arr[x][y]);
			if (nx < 0 || ny < 0 || nx > arr.length-1 || ny > arr[nx].length-1) continue;
			if (arr[nx][ny] == 10) continue;
			if (check[nx][ny]) {
				cycle = true;
				return;
			}
			if (dp[nx][ny] > time) continue;
			check[nx][ny] = true;
			dfs(nx, ny, time+1);
			check[nx][ny] = false;
		}
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[N][M];
		dp = new int[N][M];
		check = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			for (int j = 0; j < M; j++) {
				arr[i][j] = tmp.charAt(j) == 'H' ? 10 : tmp.charAt(j) - '0';
			}
		}
		check[0][0] = true;
		dfs(0, 0, 1);
		
		if (cycle) System.out.println("-1");
		else System.out.println(res);
		br.close();
	}
}
