package Acmicpc.Step15;

import java.util.Scanner;

public class IntegerTriangle1932 {
	public static void main(String[] args) {
		int[][] arr = null;
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), max = 0;
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for (int i = 1; i < n ; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0) {
					arr[i][j] += arr[i-1][j];
				}
				else if (j == i) {
					arr[i][j] += arr[i-1][j-1];
				}
				else {
					arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
				}
				
				if (i == (n - 1)) {
					max = arr[i][j] >= max ? arr[i][j] : max;
				}
			}
		}
		System.out.println(max);
	}
}
