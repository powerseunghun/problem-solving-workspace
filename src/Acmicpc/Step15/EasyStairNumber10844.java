package Acmicpc.Step15;

import java.util.Scanner;

public class EasyStairNumber10844 {
	public static void main(String[] args) {
		int[][] arr = null;
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		long sum = 0;
		arr = new int[N + 1][10];
		
		for (int i = 1; i < 10; i++) {
			arr[1][i] = 1;
		}
		for (int i = 2; i <= N; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0) {
					arr[i][j] = arr[i-1][j+1] % 1000000000;
				}
				else if (j == 9) {
					arr[i][j] = arr[i-1][j-1] % 1000000000;
				}
				else {
					arr[i][j] = (arr[i-1][j-1] + arr[i-1][j+1]) % 1000000000;
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			sum += arr[N][i];
		}
		
		System.out.println(sum % 1000000000);
	}
}
