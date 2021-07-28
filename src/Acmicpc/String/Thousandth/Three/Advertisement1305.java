package Acmicpc.String.Thousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Advertisement1305 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] pi = new int[1000001];
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		
		// Prefix == Suffix kmp
		for (int i = 1, j = 0; i < N; i++) {
			while (s.charAt(i) != s.charAt(j) && j > 0) {
				j = pi[j-1];
			}
			if (s.charAt(i) == s.charAt(j)) {
				pi[i] = ++j;
			}
		}
		System.out.println(N - pi[N-1]);
	}
}
