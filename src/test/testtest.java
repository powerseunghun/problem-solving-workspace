package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class testtest {
	static int[] arr = null;
	static boolean[] check = null;
	static void dfs(int m, int n, int d) {
		if (d >= m) {
			for (int el : arr) {
				System.out.print(el + " ");
			}
			System.out.println();
			return;
		}
		
		for (int i = 0; i < n; i++) {
			arr[d] = (i+1);
			dfs(m, n, d+1);
//			if (!check[i]) {
//				arr[d] = (i+1);
//				check[i] = true;
//				dfs(m, n, i+1, d+1);
//				check[i] = false;
//			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		arr = new int[M];
		check = new boolean[N];
		Arrays.fill(arr, 0);
		Arrays.fill(check, false);
		
		dfs(M, N, 0);
		br.close();
	}
}
