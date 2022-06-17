package Acmicpc.As.B3.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeficientPerfectAndAbundant6975 {
	static String check(int n) {
		String res = null;
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n%i == 0) sum += i;
		}
		if (sum == n) res = "perfect";
		else if (sum < n) res = "deficient";
		else res = "abundant";
		
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			sb.append(n + (check(n).equals("abundant") ? " is an " : " is a ") + check(n) + " number.\n\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
