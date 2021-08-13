package Acmicpc.BruteForceAlgorithm.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FlowerBed14620 {
	static int[][] map = null;
	static boolean[][] flowerCheck = null;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static int min = Integer.MAX_VALUE;
	static boolean check(int x, int y) {
		for (int i = 0, nx = 0, ny = 0; i < dirX.length; i++) {
			nx = x + dirX[i];
			ny = y + dirY[i];
			
			if (x < 0 || y < 0 || x >= (map.length) || y >= (map[x].length) || flowerCheck[nx][ny]) return false;
		}
		return true;
	}
	static void dfs(int d, int sum, int idx) {
		if (d >= 3) {
			min = Math.min(min, sum);
			return;
		}
		
		int val = 0;
		for (int i = idx; i < map.length-1; i++) {
			for (int j = 1; j < map[i].length-1; j++) {
				if (flowerCheck[i][j] || !check(i, j)) continue;
				val = map[i][j];
				flowerCheck[i][j] = true;
				for (int k = 0, nx = 0, ny = 0; k < 4; k++) {
					flowerCheck[i+dirX[k]][j+dirY[k]] = true;
					val += map[i+dirX[k]][j+dirY[k]];
				}
				dfs(d+1, sum+val, i);
				
				flowerCheck[i][j] = false;
				for (int k = 0, nx = 0, ny = 0; k < 4; k++) {
					flowerCheck[i+dirX[k]][j+dirY[k]] = false;
				}
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		flowerCheck = new boolean[N][N];
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(0, 0, 1);
		System.out.println(min);
	}
}
