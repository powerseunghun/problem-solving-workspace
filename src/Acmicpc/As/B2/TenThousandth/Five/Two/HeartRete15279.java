package Acmicpc.As.B2.TenThousandth.Five.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeartRete15279 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		double b = 0, p = 0, v = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			b = Double.parseDouble(str.split(" ")[0]);
			p = Double.parseDouble(str.split(" ")[1]);
			v = 60*b/p;
			
			sb.append(String.format("%.4f ", v*(1-1/b)));
			sb.append(String.format("%.4f ", v));
			sb.append(String.format("%.4f", v*(1+1/b))).append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
