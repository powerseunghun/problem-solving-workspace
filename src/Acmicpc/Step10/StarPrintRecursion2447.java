package Acmicpc.Step10;

import java.util.Scanner;

public class StarPrintRecursion2447 {
	static void recursionFunc(int x, int y, int N, char[][] arr) {
		int pa = N / 3;
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if(!(i == 1 && j == 1)) {
					recursionFunc(x + (pa * i), y + (pa * j), pa, arr);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[][] arr = new char[N][N];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ' ';
			}
		}
		recursionFunc(0, 0, N, arr);
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
