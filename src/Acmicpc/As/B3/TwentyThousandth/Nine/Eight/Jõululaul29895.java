package Acmicpc.As.B3.TwentyThousandth.Nine.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jõululaul29895 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long N = Long.parseLong(br.readLine());
		
		for (int i=1; i <=N; i++) {
			sb.append(i*(N-i+1)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
