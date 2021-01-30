package Practice;

import java.util.Scanner;

public class FillArray3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), dir = 0, count = 0;
		int[][] arr = new int[n][m];
		
		for (int i = m - 1; i >= 0; i--) {
			if (dir % 2 == 0) {
				for (int j = n - 1; j >= 0; j--) {
					arr[j][i] = ++count;
				}
			}
			else {
				for (int j = 0; j < n; j++) {
					arr[j][i] = ++count;
				}
			}
			dir++;
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
