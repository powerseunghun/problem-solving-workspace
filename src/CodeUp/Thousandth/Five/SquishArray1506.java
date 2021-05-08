package CodeUp.Thousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquishArray1506 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][n];
		int th = 0, r = 0, c = -1, d = 1;
		
		for (int value = 1; value <= n * n;) {
			for (int j = 0; j < n - th; j++) {
				c += d;
				arr[c][r] = value++;
			}
			for (int j = 0; j < n - th - 1; j++) {
				r += d;
				arr[c][r] = value++;
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
