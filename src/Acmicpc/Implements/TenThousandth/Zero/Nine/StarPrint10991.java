package Acmicpc.Implements.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPrint10991 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), space = N-1;
		for (int i = 1; i <= N; i++, space--) {
			for (int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < 2*i-1; j++) {
				if (j % 2 == 0) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
