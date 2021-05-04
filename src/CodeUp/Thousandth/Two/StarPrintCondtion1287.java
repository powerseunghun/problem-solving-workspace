package CodeUp.Thousandth.Two;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class StarPrintCondtion1287 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 0; j < i * n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
