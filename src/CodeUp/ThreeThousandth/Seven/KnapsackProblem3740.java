package CodeUp.ThreeThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KnapsackProblem3740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int W = Integer.parseInt(tmp.split(" ")[1]);
		int[] w = new int[N+1], v = new int[N+1];
		int[] dp = new int[W+1];
		Arrays.fill(w, 0);
		Arrays.fill(v, 0);
		Arrays.fill(dp, 0);
		
		for (int i = 1; i <= N; i++) {
			tmp = br.readLine();
			w[i] = Integer.parseInt(tmp.split(" ")[0]);
			v[i] = Integer.parseInt(tmp.split(" ")[1]);
		}
		for (int i = 1; i <= N; i++) {
			for (int j = W; j >= 1; j--) {
				if (w[i] <= j) {
					dp[j] = Math.max(dp[j], dp[j-w[i]]+v[i]);
				}
			}
		}
		
		System.out.println(dp[W]);
	}
}
