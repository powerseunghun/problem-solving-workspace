package Acmicpc.Step19;

import java.util.Scanner;

public class ColorerdPaper2630 {
	static int[][] paper = null;
	static int blue = 0, white = 0;
	static boolean check(int x, int y, int N) {
		boolean flag = true;
		int fv = paper[x][y];
		
		for (int i = x; i < x + N; i++) {
			for (int j = y; j < y + N; j++) {
				if (fv != paper[i][j]) {
					flag = false;
					return flag;
				}
			}
		}
		if (fv == 1) blue++;
		else white++;
		
		return flag;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			if (paper[x][y] == 1) blue++;
			else white++;
			return;
		}
		
		if (check(x, y, N)) {
			return;
		}
		divide(x, y, N / 2);
		divide(x, y + (N / 2), N / 2);
		divide(x + (N / 2), y, N / 2);
		divide(x + (N / 2), y + (N / 2), N / 2);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		paper = new int[N][N];
		
		for (int i = 0; i < paper.length; i++) {
			for (int j = 0; j < paper[i].length; j++) {
				paper[i][j] = sc.nextInt();
			}
 		}
		
		divide(0, 0, N);
		
		System.out.println(white);
		System.out.println(blue);
	}
}
