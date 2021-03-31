package Acmicpc.Step19;

import java.util.Scanner;

public class QuadTree1992 {
	static int[][] video = null;
	static boolean check(int x, int y, int N) {
		int fv = video[x][y];
		for (int i = x; i < x + N; i++) {
			for (int j = y; j < y + N; j++) {
				if (fv != video[i][j]) {
					return false;
				}
			}
		}
		return true;
	}
	static void divide(int x, int y, int N) {
		if (N == 1) {
			System.out.print(video[x][y]);
			return;
		}
		
		if (check(x, y, N)) {
			if (video[x][y] == 0) {
				System.out.print("0");
			}
			else {
				System.out.print("1");
			}
			return;
		}
		
		System.out.print("(");
		divide(x, y, N / 2);
		divide(x, y + N / 2, N / 2);
		divide(x + N / 2, y, N / 2);
		divide(x + N / 2, y + N / 2, N / 2);
		System.out.print(")");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		video = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			String s = sc.nextLine();
			for (int j = 0; j < s.length(); j++) {
				video[i][j] = s.charAt(j) - '0';
			}
		}
		divide(0, 0, N);
	}
}
