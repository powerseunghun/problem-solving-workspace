package Acmicpc.As.B3.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Divisors13225 {
	static int func(int n) {
		int cnt = 0;
		for (int i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i*i == n) cnt++;
				else cnt += 2;
			}
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), n = 0;
		
		while(T-- > 0) {
			n = Integer.parseInt(br.readLine());
			sb.append(n + " " + func(n) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
