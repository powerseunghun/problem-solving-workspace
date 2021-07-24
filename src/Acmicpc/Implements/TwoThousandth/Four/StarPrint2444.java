package Acmicpc.Implements.TwoThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPrint2444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int space = N-1;
		for (int i = 1; i <= N; i++, space--) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		space = 1;
		for (int i = N-1; i >= 0; i--, space++) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
