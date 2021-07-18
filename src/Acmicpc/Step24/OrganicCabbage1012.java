package Acmicpc.Step24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrganicCabbage1012 {
	static int[][] arr = null;
	static void dfs(int x, int y, int M, int N) {
		if (x < 0 || y < 0 || x > (M-1) || y > (N-1)) return;
		if (arr[x][y] == 0) return;
		
		arr[x][y] = 0;
		
		dfs(x, y-1, M, N);
		dfs(x-1, y, M, N);
		dfs(x, y+1, M, N);
		dfs(x+1, y, M, N);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		int M = 0, N = 0, K = 0, X = 0, Y = 0, count = 0;
		for (int i = 0; i < T; i++) {
			tmp = br.readLine();
			M = Integer.parseInt(tmp.split(" ")[0]);
			N = Integer.parseInt(tmp.split(" ")[1]);
			K = Integer.parseInt(tmp.split(" ")[2]);
			arr = new int[M][N];
			
			for (int j = 0; j < K; j++) {
				tmp = br.readLine();
				X = Integer.parseInt(tmp.split(" ")[0]);
				Y = Integer.parseInt(tmp.split(" ")[1]);
				arr[X][Y] = 1;
			}
			count = 0;
			
			for (int j = 0; j < arr.length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					if (arr[j][k] == 1) {
						count++;
						dfs(j, k, M, N);
					}
				}
			}
			sb.append(count + "\n");
		}
		System.out.println(sb.toString());
	}
}
