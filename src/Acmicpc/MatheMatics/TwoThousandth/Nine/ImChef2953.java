package Acmicpc.MatheMatics.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ImChef2953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int[][] arr = new int[5][4];
		int score = 0, max = 0, n = 0;
		
		for (int i = 1; i <= 5; i++, score = 0) {
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				score += Integer.parseInt(st.nextToken());
			}
			if (score > max) {
				max = score;
				n = i;
			}
		}
		System.out.println(n + " " + max);
	}
}
