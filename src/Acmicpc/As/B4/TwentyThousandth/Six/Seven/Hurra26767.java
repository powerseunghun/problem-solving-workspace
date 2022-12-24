package Acmicpc.As.B4.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hurra26767 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			sb.append((i%7==0) && (i%11==0) ? "Wiwat!" : i%7==0 ? "Hurra!" : i%11==0 ? "Super!" : i);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
