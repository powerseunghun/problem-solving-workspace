package Acmicpc.BruteForceAlgorithm.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MakeMaxDiff10819 {
	static int max = 0;
	static int[] nums = null;
	static int[] arr = null;
	static boolean[] check = null;
	static void calc() {
		int sum = 0;
		for (int i = 0; i < arr.length-1; i++) {
			sum += Math.abs(arr[i+1] - arr[i]);
		}
		max = Math.max(max, sum);
	}
	static void dfs(int n, int d) {
		if (d >= n) {
			calc();
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = nums[i];
				dfs(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		nums = new int[N];
		arr = new int[N];
		check = new boolean[N];
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		dfs(N, 0);
		System.out.println(max);
	}
}
