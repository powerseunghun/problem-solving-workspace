package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BudgetManagement3510 {
	static int max = 0;
	static int[] arr = null;
	static int[] budget = null;
	static void bt(int n, int d, int sum, int b, boolean[] check) {
		max = max >= sum ? max : sum;
		if (d >= n) return;
		
		for (int i = 0; i < n; i++) {
			if (sum + budget[i] <= b && !check[i]) {
				check[i] = true;
				arr[d] = budget[i];
				bt(n, d+1, sum+budget[i], b, check.clone());
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		budget = new int[N];
		arr = new int[N];
		boolean[] check = new boolean[N];
		Arrays.fill(check, false);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < budget.length; i++) {
			budget[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(N, 0, 0, B, check);
		System.out.println(max);
	}
}
