package SWExpertAcademy.D3.TenThousandth.One.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalkinWilfTree11688 {
	static long GCD(long a, long b) {
		if (b % a == 0) return a;
		else return GCD(b%a, a);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int T = Integer.parseInt(br.readLine());
		long a = 1, b = 1, gcd = 0;
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			a = 1; b = 1;
			for (int j = 0; j < tmp.length(); j++) {
				switch(tmp.charAt(j)) {
				case 'L':
					b = a+b;
					break;
				case 'R':
					a = a+b;
					break;
				}
			}
			gcd = GCD(a, b);
			sb.append("#" + i + " " + a/gcd + " " + b/gcd + "\n");
		}
		System.out.print(sb.toString());
	}
}
