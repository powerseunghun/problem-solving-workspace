package Acmicpc.As.B2.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Zeros9916 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()), res = 0;
		BigInteger bi = new BigInteger("1");
		
		for (int i = 1; i <= n; i++) {
			bi = bi.multiply(new BigInteger(String.valueOf(i)));
		}
		
		for (int i = 0; i < bi.toString().length(); i++) {
			char c = bi.toString().charAt(i);
			if (c == '0') res++;
		}
		
		System.out.println(res);
		br.close();
	}
}
