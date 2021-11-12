package Goorm.Level3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Resort {
	static int[] arr = new int[101];
	static int[][] dp = new int[101][101];
	static int func(int N, int d, int c, int p) {
		if (N < d) return p;
		if (dp[d][c] != 0) return dp[d][c]+p;
		if (arr[d] != 0) return func(N, d+1, c, p);
		
		int res = func(N, d+1, c, p+10000);
		res = Math.min(res, func(N, d+3, c+1, p+25000));
		res = Math.min(res, func(N, d+5, c+2, p+37000));
		
		if (c >= 3) res = Math.min(res, func(N, d+1, c-3, p));
		dp[d][c] = res-p;
		
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 0, day = 0; i < M; i++) {
			day = Integer.parseInt(st.nextToken());
			arr[day] = 1;
		}
		System.out.println(func(N, 1, 0, 0));
	}
}
