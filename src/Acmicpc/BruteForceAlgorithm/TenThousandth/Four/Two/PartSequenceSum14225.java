package Acmicpc.BruteForceAlgorithm.TenThousandth.Four.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PartSequenceSum14225 {
	static int[] arr = null;
	static boolean[] nums = null;
	static int N = 0;
	static void dfs(int d, int sum) {
		if (d >= 1) nums[sum] = true;
		
		if (d >= N) return;
		
		for (int i = d; i < N; i++) {
			dfs(i+1, sum+arr[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		nums = new boolean[sum+2];
		dfs(0, 0);
		
		for (int i = 1; i < nums.length; i++) {
			if (!nums[i]) {
				System.out.println(i);
				return;
			}
		}
	}
}
