package Acmicpc.As.B2.ThirtyThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShuffleCalc31215 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			sb.append(N < 3 ? 1 : 3).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
