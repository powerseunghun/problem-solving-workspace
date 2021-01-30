package Practice;

import java.util.Scanner;

public class FillArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		int[][] arr = new int[n][m];
		int count = 0, dir = 0;
		
		for (int i = n - 1; i >= 0; i--) {
			if (dir % 2 == 0) {
				for (int j = m - 1; j >= 0; j--) {
					arr[i][j] = ++count;
				}
			}
			else {
				for (int j = 0; j < m; j++) {
					arr[i][j] = ++count;
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
