package Acmicpc.As.B3.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Golden10187 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		double d1 = 0, d2 = 0, m = 0;
		
		while(T-- > 0) {
			str = br.readLine();
			d1 = Double.parseDouble(str.split(" ")[0]);
			d2 = Double.parseDouble(str.split(" ")[1]);
			m = (1+Math.sqrt(5.0)) / 2;
			
			sb.append(Math.abs(d1/d2-m) <= m/100 ? "golden" : "not").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
