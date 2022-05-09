package Codeforce.OrderSubmit.TwoThousandth.FourHundred;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedArray {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, i = 0;
		
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			if (n % 4 != 0) {
				sb.append("NO\n");
				continue;
			}
			sb.append("YES\n");
			
			for (i = 2; i <= n; i+=2) {
				sb.append(i + " ");
			}
			for (i = 1; i < n-1; i+=2) {
				sb.append(i + " ");
			}
			sb.append((n/2+i) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
