package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContinuousNumberSumHell2726 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine()), sum = 0, count = 0;
		
//		System.out.println(n);
		for (long i = 1; i <= n; i++) {
			sum = i;
			for (long j = i+1; j <= n; j++) {
				if (sum + j > n) break;
				else sum += j;
				if (sum == n) count++;
			}
		}
		
		System.out.println(count);
	}
}
