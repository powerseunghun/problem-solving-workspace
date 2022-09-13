package Acmicpc.As.B3.TenThousandth.Eight.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NMPrint18883 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]);
		
		for (int i = 1; i <= N*M; i++) {
			sb.append(i);
			if (i % M == 0) sb.append("\n");
			else sb.append(" ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
