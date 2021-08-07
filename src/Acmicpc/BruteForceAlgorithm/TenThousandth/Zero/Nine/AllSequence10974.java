package Acmicpc.BruteForceAlgorithm.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllSequence10974 {
	static int[] arr = null;
	static boolean[] check = null;
	static void dfs(int n, int d) {
		if (d >= n) {
			for (int el : arr) {
				System.out.print(el + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = i+1;
				dfs(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		check = new boolean[N];
		dfs(N, 0);
	}
}
