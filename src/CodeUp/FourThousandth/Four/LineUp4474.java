package CodeUp.FourThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineUp4474 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), max = 0;
		int[] arr = new int[n], dp = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dp[0] = 1;
		for (int i = 1; i < n; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if(arr[j] < arr[i] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j]+1;
					max = dp[i] >= max ? dp[i] : max;
				}
			}
		}
		System.out.println(n-max);
	}
}
