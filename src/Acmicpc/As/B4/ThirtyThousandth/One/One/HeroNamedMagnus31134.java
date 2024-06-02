package Acmicpc.As.B4.ThirtyThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeroNamedMagnus31134 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0;
		
		while(T-- > 0) {
			N = Long.parseLong(br.readLine());
			sb.append(N*2-1).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
