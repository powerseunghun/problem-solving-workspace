package Acmicpc.As.B2.ThirtyThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FillingDiamonds30174 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			sb.append(br.readLine()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
