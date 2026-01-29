package Acmicpc.As.B2.TenThousandth.Six.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongPassword16944 {
	static int func1(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('0' <= c && c <= '9') return 0;
		}
		return 1;
	}
	static int func2(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('a' <= c && c <= 'z') return 0;
		}
		return 1;
	}
	static int func3(String str) {
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if ('A' <= c && c <= 'Z') return 0;
		}
		return 1;
	}
	static int func4(String str) {
		String v = "!@#$%^&*()-+";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (v.contains(c+"")) return 0;
		}
		return 1;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		System.out.println(Math.max(6-N, func1(str)+func2(str)+func3(str)+func4(str)));
		br.close();
	}
}
