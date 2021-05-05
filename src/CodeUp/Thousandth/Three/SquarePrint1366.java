package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquarePrint1366 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n-1 || 
					i == j || i + j == n-1 || 
					j == 0 || j == n-1 || 
					i == n / 2 || j == n / 2) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
