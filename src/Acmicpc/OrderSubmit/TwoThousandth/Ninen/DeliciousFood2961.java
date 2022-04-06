package Acmicpc.OrderSubmit.TwoThousandth.Ninen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeliciousFood2961 {
	static boolean[] check = null;
	static int[][] arr = null;
	static int res = Integer.MAX_VALUE;
	static void dfs(int n, int d) {
		if (d >= n) {
			int a = 1, b = 0;
			boolean flag = false;
			for(int i = 0; i < check.length; i++) {
				if (check[i]) {
					flag = true;
					a *= arr[i][0];
					b += arr[i][1];
				}
			}
			if (!flag) return;
			if (Math.abs(a-b) < res) {
				res = Math.abs(a-b);
			}
			return;
		}
		check[d] = true;
		dfs(n, d+1);
		check[d] = false;
		dfs(n, d+1);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null;
		check = new boolean[N];
		arr = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			arr[i][0] = Integer.parseInt(tmp.split(" ")[0]);
			arr[i][1] = Integer.parseInt(tmp.split(" ")[1]);
		}
		dfs(N, 0);
		System.out.println(res);
		br.close();
	}
}
