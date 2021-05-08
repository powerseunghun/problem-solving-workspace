package CodeUp.Thousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TwoDimensionArraySquishFill1484 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int n = Integer.parseInt(tmp.split(" ")[0]), m = Integer.parseInt(tmp.split(" ")[1]);
		int[][] arr = new int[n][m];
		int th = 0, r = 0, c = -1, d = 1;
		
		for (int value = 1; value <= n * m;) {
			for (int j = 0; j < m - th; j++) {
				c += d;
				arr[r][c] = value++;
			}
			for (int j = 0; j < n - th - 1; j++) {
				r += d;
				arr[r][c] = value++;
			}
			th++; d *= -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
