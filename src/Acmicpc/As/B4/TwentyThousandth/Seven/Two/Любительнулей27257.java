package Acmicpc.As.B4.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Любительнулей27257 {
	static int func(String str) {
		int res = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			if (str.charAt(i) == '0') res++;
			else break;
		}
		return str.length() - str.replaceAll("0", "").length() - res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(func(str));
		br.close();
	}
}
