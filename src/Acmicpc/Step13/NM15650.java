package Acmicpc.Step13;

import java.util.Scanner;

public class NM15650 {
	static int[] array = null;
	public void search(int N, int M, int d, int c) {
		if (d == M) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = c; i <= N; i++) {
			array[d] = i;
			search(N, M, d + 1, i + 1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), M = sc.nextInt();
		array = new int[M];
		
		new  NM15650().search(N, M, 0, 1);
	}
}
