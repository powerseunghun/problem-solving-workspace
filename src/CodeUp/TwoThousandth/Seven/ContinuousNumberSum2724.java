package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousNumberSum2724 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), sum = 0, count = 0;
		
		for (int i = 1; i <= n; i++) {
			sum = i;
			for (int j = i+1; j <= n; j++) {
				if (sum + j > n) break;
				else sum += j;
				if (sum == n) count++;
			}
		}
		
		System.out.println(count);
	}
}
