package Goorm.Level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoHandScale {
	static int[] weight = null;
	static int[] arr = null;
	static void dfs(int n, int d, int sum) {
		if (d >= n) {
			if (sum < 0) return;
			arr[sum] = 1;
			return;
		}
		dfs(n, d+1, sum-weight[d]);
		dfs(n, d+1, sum+weight[d]);
		dfs(n, d+1, sum);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), sum = 0, count = 0;
		weight = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < weight.length; i++) {
			weight[i] = Integer.parseInt(st.nextToken());
			sum += weight[i];
		}
		arr = new int[sum+1];
		Arrays.fill(arr, 0);
		dfs(N, 0, 0);
		
		for (int i = 0; i <= sum; i++) {
			if (arr[i] == 0) count++;
		}
		System.out.println(count);
	}
}
