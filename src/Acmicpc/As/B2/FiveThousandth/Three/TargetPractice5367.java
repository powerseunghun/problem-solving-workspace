package Acmicpc.As.B2.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TargetPractice5367 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), lt = 1, rt = N;
		
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (j == 1 || j == N) {
					sb.append("|");
					continue;
				}
				if (i == 1 || i == N) {
					sb.append("-");
					continue;
				}
				if (j == lt || j == rt) {
					sb.append("*");
				}
				else sb.append(" ");
			}
			lt++;
			rt--;
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
