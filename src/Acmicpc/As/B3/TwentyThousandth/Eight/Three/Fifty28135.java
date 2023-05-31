package Acmicpc.As.B3.TwentyThousandth.Eight.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fifty28135 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), w = 0;
		
		for (int i = 1; i <= N; i++) {
			if (String.valueOf(i).contains("50")) {
				if (i == N) break;
				w++;
			}
		}
		
		System.out.println(N+w);
		br.close();
	}
}
