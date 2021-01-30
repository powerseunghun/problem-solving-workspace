package Practice;

import java.util.Scanner;

public class PaperCutting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == m - 1) {
					if (j == 0 || j == n - 1) {
						System.out.print("+");
					}
					else {
						System.out.print("-");
					}
				}
				else {
					if (j == 0 || j == n - 1) {
						System.out.print("|");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}