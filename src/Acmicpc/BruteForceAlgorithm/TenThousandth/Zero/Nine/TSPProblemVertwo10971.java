package Acmicpc.BruteForceAlgorithm.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.StringTokenizer;

public class TSPProblemVertwo10971 {
	static int[][] w = null;
	static int[] arr = null;
	static boolean[] check = null;
	static int minVal = Integer.MAX_VALUE;
	static void dfs(int n, int d) {
		if (d >= n) {
			int sum = 0;
			for (int i = 0, j = 0; i < arr.length; i++) {
				if (i+1 >= arr.length) {
					j = 0;
				}
				else j = i+1;
				
				if (w[arr[i]][arr[j]] == 0) return;
				sum += w[arr[i]][arr[j]];
			}
			minVal = Math.min(minVal, sum);
		}
		for (int i = 0; i < w.length; i++) {
			if (!check[i]) {
				arr[d] = i;
				check[i] = true;
				dfs(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		w = new int[N][N];
		arr = new int[N];
		check = new boolean[N];
		
		for (int i = 0; i < w.length; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < w[i].length; j++) {
				w[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		dfs(N, 0);
		System.out.println(minVal);
	}
}
