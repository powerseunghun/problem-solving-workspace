package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OddMagicSquare1510 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] ms = new int[n][n];
		int r = 0, c = n / 2;
		
		for (int value = 1; value <= n*n; value++) {
			ms[r][c] = value;
			if (value % n == 0) {
				r = (r+1) % n;
			}
			else {
				r = r-1 < 0 ? n-1 : r-1;
				c = (c+1) % n;
			}
		}
		
		for (int i = 0; i < ms.length; i++) {
			for (int j = 0; j < ms[i].length; j++) {
				System.out.print(ms[i][j] + " ");
			}
			System.out.println();
		}
	}
}
