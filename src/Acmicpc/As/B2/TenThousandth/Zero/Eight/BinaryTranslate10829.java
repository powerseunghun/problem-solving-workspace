package Acmicpc.As.B2.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryTranslate10829 {
	static String func(long N) {
		StringBuilder sb = new StringBuilder();
		String res = null;
		
		while(N != 0) {
			sb.append(N%2);
			N /= 2;
		}
		res = sb.reverse().toString();
		return res.charAt(0) == '0' ? res.substring(1, res.length()) : res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.parseLong(br.readLine());
		System.out.println(func(N));
		
		br.close();
	}
}
