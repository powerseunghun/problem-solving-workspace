package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SequenceMaxMultiple4424 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[Integer.parseInt(br.readLine())], dp = new double[arr.length];
		double max = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(br.readLine());
		}
		dp[0] = arr[0];
		
		for (int i = 1; i < dp.length; i++) {
			dp[i] = Math.max(arr[i], dp[i-1] * arr[i]);
			max = dp[i] >= max ? dp[i] : max;
		}
		
		System.out.printf("%.3f\n", max);
	}
}
