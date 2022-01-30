package Acmicpc.OrderSubmit.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPrint10992 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int leftSpace = N-1;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < leftSpace; j++) {
				System.out.print(" ");
			}
			if (i == 0) {
				System.out.print("*");
			}
			else if (i == N-1) {
				for (int j = 0; j < (N-1) * 2 + 1; j++) {
					System.out.print("*");
				}
			}
			else {
				for (int j = 0; j < i * 2 + 1; j++) {
					if (j == 0 || j == i * 2) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}
			}
			leftSpace--;
			System.out.println();
		}
	}
}
