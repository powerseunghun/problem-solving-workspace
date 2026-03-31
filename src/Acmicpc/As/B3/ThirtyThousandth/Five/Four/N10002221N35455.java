package Acmicpc.As.B3.ThirtyThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N10002221N35455 {
	static long func(int N) {
		double r = Math.pow(10, 7) / (N*2);
		return (long)((r * 2 + 1) * N);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			sb.append(String.valueOf(func(N)).equals(str.split(" ")[1]) ? "Yes" : "No").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
