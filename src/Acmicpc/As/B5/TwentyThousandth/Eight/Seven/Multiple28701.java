package Acmicpc.As.B5.TwentyThousandth.Eight.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiple28701 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine()), res = 0;
		
		for (int i = 1; i <= N; i++) {
			res += (int)Math.pow(i, 3);
		}
		
		System.out.println(N * (N+1) / 2);
		System.out.println((int)Math.pow(N*(N+1)/2, 2));
		System.out.println(res);
		
		br.close();
	}
}
