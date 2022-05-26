package Acmicpc.As.B3.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangularNumberSum2721 {
	static long[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		long sum = 0;
		
		while (T-- > 0) {
			n = Integer.parseInt(br.readLine());
			arr = new long[n+2];
			sum = 0;
			for (int i = 1; i < arr.length; i++) {
				arr[i] = i;
			}
			for (int i = 2; i < arr.length; i++) {
				arr[i] += arr[i-1];
			}
			for (int i = 1; i <= n; i++) {
				sum += (i * arr[i+1]);
			}
			sb.append(sum + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
