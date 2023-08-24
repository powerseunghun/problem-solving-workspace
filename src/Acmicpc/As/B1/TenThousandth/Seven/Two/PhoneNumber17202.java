package Acmicpc.As.B1.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneNumber17202 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String p1 = br.readLine(), p2 = br.readLine(), res = null;
		
		for (int i = 0, a = 0, b = 0; i < p1.length()+p2.length(); i++) {
			if (i % 2 == 0) {
				sb.append(p1.charAt(a++));
			}
			else {
				sb.append(p2.charAt(b++));
			}
		}
		res = sb.toString();
		
		while (res.length() != 2) {
			sb = new StringBuilder();
			for (int i = 0, a = 0, b = 0; i < res.length()-1; i++) {
				a = res.charAt(i) - '0';
				b = res.charAt(i+1) - '0';
				sb.append((a+b) % 10);
			}
			res = sb.toString();
		}
		
		System.out.println(res);
		br.close();
	}
}
