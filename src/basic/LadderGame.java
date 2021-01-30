package basic;

import java.util.Scanner;

public class LadderGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), n = sc.nextInt(), j = 0;
		int ladder[][] = new int[n + 2][k + 2];
		
		for (int i = 1; i <= n; i++) {
			ladder[i][sc.nextInt()] = 1;
			ladder[i][sc.nextInt()] = 1;
		}
		j = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (ladder[i][j] == 1) {
				j = ladder[i][j-1] == 1 ? j - 1 : j + 1;
			}
		}
		
		System.out.println(j);
	}
}
