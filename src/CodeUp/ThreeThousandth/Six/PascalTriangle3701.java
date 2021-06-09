package CodeUp.ThreeThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PascalTriangle3701 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[][] arr = new long[n][n];
		
		for (int i = 0; i < arr.length; i++) {
			Arrays.fill(arr[i], 0);
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || i == j) {
					arr[i][j] = 1;
				}
				else {
					arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
				}
				
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
