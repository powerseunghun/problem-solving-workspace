package Acmicpc.As.B2.TenThousandth.Zero.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AcidBase10182 {
	static double func(String b, double c) {
		return b.equals("H") ? Math.log10(c)*-1 : Math.log10(c)+14;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(String.format("%.2f\n", func(str.split(" ")[0], Double.parseDouble(str.split(" ")[2]))));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
