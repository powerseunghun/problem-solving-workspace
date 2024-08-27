package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ornaments26550 {
	static long func(long n) {
		return n*(n+1)*(n+2)/6;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long n = 0;
		
		while(T-- > 0) {
			n = Long.parseLong(br.readLine());
			sb.append(func(n)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
