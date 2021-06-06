package CodeUp.ThreeThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BudgetManagement3510 {
	static int max = 0;
	static int[] arr = null;
	static int[] budget = null;
	static void bt(int n, int d, int sum, int b) {
		for (int i = 0; i < n; i++) {
			arr[d] = budget[i];
			if (sum + budget[i] >= b) {
				max = max >= sum ? max : sum;
				return;
			}
			bt(n, d+1, sum+budget[i], b);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int B = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		budget = new int[N];
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < budget.length; i++) {
			budget[i] = Integer.parseInt(st.nextToken());
		}
		
		bt(N, 0, 0, B);
		System.out.println(max);
	}
}
