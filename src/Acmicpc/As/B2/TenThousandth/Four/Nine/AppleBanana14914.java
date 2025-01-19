package Acmicpc.As.B2.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppleBanana14914 {
	static int gcd(int a, int b) {
		return b != 0 ? gcd(b, a%b) : a;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int a = Integer.parseInt(str.split(" ")[0]);
		int b = Integer.parseInt(str.split(" ")[1]);
		int g = gcd(a, b);
		
		for (int i = 1; i <= g; i++) {
			if (g % i == 0) {
				sb.append(i).append(" " + a/i).append(" " + b/i).append("\n");
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}