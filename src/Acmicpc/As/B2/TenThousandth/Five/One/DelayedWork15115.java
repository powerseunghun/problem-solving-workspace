package Acmicpc.As.B2.TenThousandth.Five.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DelayedWork15115 {
	static final int l = 10000;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		double K = Double.parseDouble(str.split(" ")[0]);
		double P = Double.parseDouble(str.split(" ")[1]);
		double X = Double.parseDouble(str.split(" ")[2]);
		double res = 1e9;
		
		for (int i = 1; i <= l; i++) {
			res = Math.min(res, K*P/i+X*i);
		}
		
		System.out.println(String.format("%.3f", res));
		br.close();	}
}
