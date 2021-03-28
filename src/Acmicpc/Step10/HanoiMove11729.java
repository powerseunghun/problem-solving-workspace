package Acmicpc.Step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HanoiMove11729 {
	static void hanoi(int n, int from, int temp, int to, StringBuilder sb) {
		if (n == 1) {
			sb.append(from + " " + to + "\n");
		}
		else {
			hanoi(n-1, from, to, temp, sb);
			sb.append(from + " " + to + "\n");
			hanoi(n-1, temp, from, to, sb);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		sb.append((int)(Math.pow(2, N) - 1) + "\n");
		hanoi(N, 1, 2, 3, sb);
		
		System.out.println(sb);
	}
}
