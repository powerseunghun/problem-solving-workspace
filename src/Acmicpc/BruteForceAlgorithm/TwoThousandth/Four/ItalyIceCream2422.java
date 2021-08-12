package Acmicpc.BruteForceAlgorithm.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ItalyIceCream2422 {
	static int[][] cant = null;
	static boolean[] check = null;
	static int[] arr = new int[3];
	static int N = 0, count = 0;
	static void dfs(int n, int d, int start) {
		if (d >= n) {
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if (cant[arr[i]][arr[j]] == 1) return;
				}
			}
			count++;
			return;
		}
		
		for (int i = start; i < N; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = (i+1);
				dfs(n, d+1, i+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		check = new boolean[N];
		cant = new int[N+1][N+1];
		
		for (int i = 0, c1 = 0, c2 = 0; i < M; i++) {
			tmp = br.readLine();
			c1 = Integer.parseInt(tmp.split(" ")[0]);
			c2 = Integer.parseInt(tmp.split(" ")[1]);
			cant[c1][c2] = 1;
			cant[c2][c1] = 1;
		}
		dfs(3, 0, 0);
		System.out.println(count);
	}
}
