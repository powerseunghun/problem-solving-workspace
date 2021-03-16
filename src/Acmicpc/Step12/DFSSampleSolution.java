package Acmicpc.Step12;

import java.util.Scanner;

public class DFSSampleSolution {
	static int[] array = null;
	public void DFS(int d, int n) {
		if (d == n) {
			for (int i = 0; i < n; i++) {
				System.out.print(array[i] + " ");
			}
			System.out.println();
			return;
		}
		
		else {
			for (int i = 1; i <= 6; i++) {
				array[d] = i;
				DFS(d + 1, n);
			}
		}
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		array = new int[n];
		
		new DFSSampleSolution().DFS(0, n);
	}
}
