package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RhombusPrint1371 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j >= 0; j--) {
				if (i == j) System.out.print("*");
				else System.out.print(" ");
			}
			for (int j = 0; j < n; j++) {
				if (i == j) {
					System.out.print("*");
					break;
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) System.out.print("*");
				else System.out.print(" ");
			}
			for (int j = n-1; j >= 0; j--) {
				if (i == j) {
					System.out.print("*");
					break;
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
