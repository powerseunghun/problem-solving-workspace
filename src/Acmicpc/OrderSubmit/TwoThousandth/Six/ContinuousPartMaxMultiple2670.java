package Acmicpc.OrderSubmit.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousPartMaxMultiple2670 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N], dp = new double[N];
		double res = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
			dp[i] = i == 0 ? arr[i] : dp[i];
			res = i == 0 ? arr[i] : res;
		}
		
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
			res = Math.max(res, dp[i]);
		}
		
		System.out.printf("%.3f\n", res);
		br.close();
	}
}
