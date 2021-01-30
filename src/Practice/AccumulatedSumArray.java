package Practice;

import java.util.Scanner;

public class AccumulatedSumArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), sum = 0;
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
				sum = 0;
				for (int a = 0; a <= i; a++) {
					for (int b = 0; b <= j; b++) {
						sum += arr[a][b];
					}
				}
				System.out.print(sum + " ");
			}
			System.out.println();
		}
	}
}
