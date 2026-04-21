package Acmicpc.As.B3.ThirtyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10002221N35455_2 {
	static long w = 10000000;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0, S = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			N = Long.parseLong(str.split(" ")[0]);
			S = Long.parseLong(str.split(" ")[1]);
			
			sb.append(N+w == S ? "Yes" : "No").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
