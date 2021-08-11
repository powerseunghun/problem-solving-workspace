package Acmicpc.BruteForceAlgorithm.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CrazyRobot1405 {
	static boolean[][] check = new boolean[30][30];
	static double[] percent = new double[4];
	static int[] dirX = {0, 0, 1, -1};
	static int[] dirY = {1, -1, 0, 0};
	static int N = 0;
	static double res = 0.0;
	static void dfs(int x, int y, int d, double p) {
		if (d == N) {
			res += p;
			return;
		}
		
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			if (nx < 0 || ny < 0 || nx >= 30 || ny >= 30) continue;
			if (!check[nx][ny]) {
				check[nx][ny] = true;
				dfs(nx, ny, d+1, p * percent[i]);
				check[nx][ny] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sx = 15, sy = 15;
		N = Integer.parseInt(st.nextToken());
		for (int i = 0; i < percent.length; i++) {
			percent[i] = Double.parseDouble(st.nextToken()) * 0.01;
		}
		check[sx][sy] = true;
		dfs(sx, sy, 0, 1);
		
		System.out.println(res);
	}
}
