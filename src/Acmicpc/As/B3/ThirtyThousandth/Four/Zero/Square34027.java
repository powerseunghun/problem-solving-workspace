package Acmicpc.As.B3.ThirtyThousandth.Four.Zero;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Square34027 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		double r = 0;
		
		while(T-- > 0) {
			r = Math.sqrt(Integer.parseInt(br.readLine()));
			sb.append(r == (int)r ? "1" : "0").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
