package Goorm.Level4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BudgetPlan {
	static int max = Integer.MIN_VALUE;
	static int[] arr = null;
	static void dfs(int B, int idx, int sum) {
		if (sum > B) return;
		
		max = Math.max(max, sum);
		for (int i = idx; i < arr.length; i++) {
			dfs(B, i+1, sum+arr[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		dfs(B, 0, 0);
		
		System.out.println(max);
		br.close();
	}
}
