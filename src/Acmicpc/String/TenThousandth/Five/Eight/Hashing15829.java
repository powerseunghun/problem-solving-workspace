package Acmicpc.String.TenThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hashing15829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		long res = 0, M = 1234567891, w = 1;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			res += ((str.charAt(i)-'a'+1) * w) % M;
			w *= 31;
			w %= M;
		}
		System.out.println(res%M);
	}
}
