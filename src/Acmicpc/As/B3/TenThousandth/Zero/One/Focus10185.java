package Acmicpc.As.B3.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Focus10185 {
	static double func(int p, int q) {
		return p*q / (double)(p+q);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), p = 0, q = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			p = Integer.parseInt(str.split(" ")[0]);
			q = Integer.parseInt(str.split(" ")[1]);
			
			sb.append("f = ").append(String.format("%.1f", func(p, q))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
