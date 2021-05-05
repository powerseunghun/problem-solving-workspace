package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrianglePrint1355 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= i) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}
