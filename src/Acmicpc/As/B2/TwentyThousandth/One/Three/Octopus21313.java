package Acmicpc.As.B2.TwentyThousandth.One.Three;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Octopus21313 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N/2; i++) {
			sb.append("1 2 ");
		}
		if (N % 2 != 0) {
			sb.append("3");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
