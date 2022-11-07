package Acmicpc.As.B3.TenThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatIsNotation13877 {
	static int func(String str, int notation) {
		int sum = 0, w = 0;
		if (notation == 8 && (str.contains("8") || str.contains("9"))) return 0;
		for (int i = str.length()-1; i >= 0; i--) {
			sum += Math.pow(notation, w++) * (str.charAt(i)-'0');
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), val = 0, b = 0, o = 0, h = 0;
		String tmp = null;
		while (T-- > 0) {
			tmp = br.readLine();
			val = Integer.parseInt(tmp.split(" ")[1]);
			b = func(val+"", 8);
			o = func(val+"", 10);
			h = func(val+"", 16);
			sb.append(Integer.parseInt(tmp.split(" ")[0]) + " " + b + " " + o + " " + h + "\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
