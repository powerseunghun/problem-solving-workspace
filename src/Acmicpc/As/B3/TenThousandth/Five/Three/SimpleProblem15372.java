package Acmicpc.As.B3.TenThousandth.Five.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleProblem15372 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0;
		
		while (T-- > 0) {
			N = Long.parseLong(br.readLine());
			sb.append((N*N) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
