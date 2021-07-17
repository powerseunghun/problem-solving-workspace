package Acmicpc.Step14;

import java.util.Scanner;

public class NM15649 {
	static int[] array = null;
	static boolean[] visitCheck = null;
	public void search(int N, int M, int d) {
		if (d == M) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			return;
		}
		for (int i = 0; i < N; i++) {
			if (!visitCheck[i]) {
				visitCheck[i] = true;
				array[d] = i + 1;
				search(N, M, d + 1);
				visitCheck[i] = false;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		array = new int[M];
		visitCheck = new boolean[N];
		new  NM15649().search(N, M, 0);
	}
}
