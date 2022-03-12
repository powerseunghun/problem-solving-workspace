package Acmicpc.OrderSubmit.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AvoidFood1743 {
	static int[][] arr = null;
	static int subArea = 0;
	static int maxArea = 0;
	static int[] dirX = {0, -1, 0, 1};
	static int[] dirY = {-1, 0, 1, 0};
	static void dfs(int x, int y) {
		if (x < 1 || y < 1 || x >= arr.length-1 || y >= arr[x].length-1) return;
		if (arr[x][y] == 0) return;
		
		subArea++;
		arr[x][y] = 0;
		
		for (int i = 0; i < dirX.length; i++) {
			dfs(x + dirX[i], y + dirY[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		int K = Integer.parseInt(tmp.split(" ")[2]);
		arr = new int[N+2][M+2];
		
		for (int i = 0, x = 0, y = 0; i < K; i++) {
			tmp = br.readLine();
			x = Integer.parseInt(tmp.split(" ")[0]);
			y = Integer.parseInt(tmp.split(" ")[1]);
			arr[x][y] = 1;
		}
		
		for (int i = 1; i < arr.length-1; i++) {
			for (int j = 1; j < arr[i].length-1; j++) {
				if (arr[i][j] == 1) {
					subArea = 0;
					dfs(i, j);
					maxArea = Math.max(maxArea, subArea);
				}
			}
		}
		
		System.out.println(maxArea);
		br.close();
	}
}
