package Acmicpc.As.B2.ThirtyThousandth.Four.Eight;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DinnerMenuWorldcup34848 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, res = 0;
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			
			res = 0;
			while(N > 1) {
				if ((N & 1) != 0) {
					res++;
				}
				N = N/2+N%2;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
