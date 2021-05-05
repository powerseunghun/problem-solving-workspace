package CodeUp.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrianglePrint1358 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), a = n / 2, tmp = a;
		int c1 = 0, c2 = 0;
		
		for (int i = 1; i <= n; i+=2) {
			for (int j = 0; j < n; j++) {
				if (tmp > c1) System.out.print(" ");
				else {
					System.out.print("*");
					c2++;
					if (c2 == i) break;
				}
				c1++;
			}
			// tmp control var init
			tmp--; c1 = 0; c2 = 0;
			System.out.println();
		}
	}
}
