package Acmicpc.NumberTheory.Thousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigGCD1850 {
	static long GCD(long a, long b) {
		while (b > 0) {
			long tmp = a;
			a = b;
			b = tmp%b;
		}
		return a;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		long a = Long.parseLong(tmp.split(" ")[0]);
		long b = Long.parseLong(tmp.split(" ")[1]);
		for (int i = 0; i < GCD(a, b); i++) {
			sb.append("1");
		}
		
		System.out.println(sb.toString());
	}
}
