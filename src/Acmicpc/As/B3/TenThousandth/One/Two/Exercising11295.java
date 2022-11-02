package Acmicpc.As.B3.TenThousandth.One.Two;

import java.io.IOException;
import java.util.Scanner;

public class Exercising11295 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int L = 0, N = 0, W = 0;
		
		for (int i = 1; ; i++) {
			L = sc.nextInt();
			if (L == 0) break;
			sb.append("User " + i + "\n");
			N = sc.nextInt();
			for (int j = 0; j < N; j++) {
				W = sc.nextInt() * L;
				sb.append(String.format("%.5f\n", W / 100000.0));
			}
		}
		
		System.out.print(sb.toString());
	}
}
