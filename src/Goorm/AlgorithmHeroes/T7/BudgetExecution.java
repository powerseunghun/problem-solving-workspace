package Goorm.AlgorithmHeroes.T7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BudgetExecution {
	static int[] budget = null;
	static int max = Integer.MIN_VALUE;
	static void dfs(int idx, int B, int sum) {
		if (sum > B) return;
		
		max = Math.max(max, sum);
		for (int i = idx; i < budget.length; i++) {
			dfs(i+1, B, sum+budget[i]);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		budget = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < budget.length; i++) {
			budget[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(0, B, 0);
		System.out.println(max);
		br.close();
	}
}
