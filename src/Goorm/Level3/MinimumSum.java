package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinimumSum {
	static long[][] nums = null;
	static boolean[] check = null;
	static long min = Long.MAX_VALUE;
	static void dfs(int n, int d, long sum) {
		if (d >= n) {
			min = Math.min(min, sum);
			return;
		}
		
		for (int i = 0; i < nums[d].length; i++) {
			if (!check[i]) {
				check[i] = true;
				dfs(n, d+1, sum+nums[d][i]);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int n = Integer.parseInt(br.readLine());
		check = new boolean[n];
		nums = new long[n][n];
		
		for (int i = 0; i < n; i++) {
			tmp = br.readLine();
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = Long.parseLong(tmp.split(" ")[j]);
			}
		}
		
		dfs(n, 0, 0);
		System.out.print(min);
		
		br.close();
	}
}
