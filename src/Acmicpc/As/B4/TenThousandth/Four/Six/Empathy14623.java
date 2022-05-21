package Acmicpc.As.B4.TenThousandth.Four.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Empathy14623 {
	static long getNumber(String str) {
		long res = 0;
		for (int i = str.length()-1, w = 0; i >= 0; i--, w++) {
			res += (str.charAt(i)-'0') * Math.pow(2, w);
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String B1 = br.readLine();
		String B2 = br.readLine();
		
		System.out.println(Long.toBinaryString(getNumber(B1)*getNumber(B2)));
		br.close();
	}
}
