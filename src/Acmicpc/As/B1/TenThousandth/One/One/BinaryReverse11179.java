package Acmicpc.As.B1.TenThousandth.One.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryReverse11179 {
	static String func(int N) {
		StringBuilder sb = new StringBuilder(Integer.toBinaryString(N));
		return sb.reverse().toString();
	}
	static long getNumber(String str) {
		long res = 0;
		for (int i = str.length()-1, w = 0; i >= 0; i--) {
			System.out.println(str.charAt(i));
			res += (str.charAt(i)-'0') * Math.pow(2, w++);
			System.out.println(res);
		}
		
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(func(N));
		System.out.println(getNumber(func(N)));
		br.close();
	}
}
