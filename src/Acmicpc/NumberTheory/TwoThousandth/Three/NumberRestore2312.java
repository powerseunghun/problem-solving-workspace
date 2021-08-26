package Acmicpc.NumberTheory.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberRestore2312 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			while (N != 1) {
				for (int j = 2, count = 0; j <= N; j++) {
					count = 0;
					while (N % j == 0) {
						N /= j;
						count++;
					}
					if (count != 0) System.out.println(j + " " + count);
				}
			}
		}
	}
}
