package Acmicpc.Step13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class NM15651 {
	static int[] array = null;
	static StringBuilder sb = new StringBuilder();
	public void search(int N, int M, int d) {
		if (d == M) {
			for (int i = 0; i < array.length; i++) {
				sb.append(array[i] + " ");
			}
			sb.append("\n");
		}
		else {
			for (int i = 1; i <= N; i++) {
				array[d] = i;
				search(N, M, d + 1);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), M = sc.nextInt();
		
		array = new int[M];
		
		new NM15651().search(N, M, 0);
		System.out.println(sb);
	}
}
