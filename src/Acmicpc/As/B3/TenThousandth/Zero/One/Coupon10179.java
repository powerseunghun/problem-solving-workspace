package Acmicpc.As.B3.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coupon10179 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine());
		double d = 0;
		
		while (t-- > 0) {
			d = Double.parseDouble(br.readLine());
			d = d / 100 * 80;
			sb.append("$" + String.format("%.2f\n", d));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
