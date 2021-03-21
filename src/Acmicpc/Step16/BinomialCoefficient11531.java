package Acmicpc.Step16;

import java.util.Scanner;

public class BinomialCoefficient11531 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int[][] dpArr = new int[1001][1001];
		
		// 1 faile think range
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i)dpArr[i][j] = 1;
				else {
					dpArr[i][j] = dpArr[i-1][j-1] + dpArr[i-1][j];
				}
			}
		}
		System.out.println(dpArr[n][k]);
	}
}
