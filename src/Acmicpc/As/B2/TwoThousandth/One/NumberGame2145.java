package Acmicpc.As.B2.TwoThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberGame2145 {
	static int func(int n) {
		int res = 0;
		while (n != 0) {
			res += n % 10;
			n /= 10;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = 0, res = 0;
		
		while (true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			res = 10;
			while (res >= 10) {
				res = func(n);
				n = res;
			}
			sb.append(res + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
