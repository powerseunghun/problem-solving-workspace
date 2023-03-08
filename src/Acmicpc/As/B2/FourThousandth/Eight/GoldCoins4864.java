package Acmicpc.As.B2.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoldCoins4864 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = 0, res = 0, w = 0;
		
		while(true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0) break;
			sb.append(N).append(" ");
			w = 1;
			res = 0;
			while(N >= 0) {
				N -= w;
				res += Math.pow(w++, 2);
			}
			res -= (Math.abs(N) * (w-1));
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
