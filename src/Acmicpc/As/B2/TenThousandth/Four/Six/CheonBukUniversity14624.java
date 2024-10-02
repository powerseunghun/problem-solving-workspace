package Acmicpc.As.B2.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheonBukUniversity14624 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		if (N % 2 == 0) {
			System.out.println("I LOVE CBNU");
		} else {
			for (int i = 0; i < N; i++) {
				sb.append("*");
			}
			sb.append("\n");
			for (int i = 0; i <= N/2; i++) {
				for (int j = 0; j < N/2-i; j++) {
					sb.append(" ");
				}
				sb.append("*");
				for (int j = 0; j < i*2-1; j++) {
					sb.append(" ");
				}
				sb.append(i != 0 ? "*" : "").append("\n");
			}
			System.out.print(sb.toString());
		}
		br.close();
	}
}
