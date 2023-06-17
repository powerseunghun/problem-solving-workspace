package Acmicpc.As.B2.TenThousandth.Five.Four;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class Vera15444 {
	static String[] strs = {
			"***************",
			"*.**.**..*.**..",
			"*******..*.****",
			"*.**.**..*.**..",
			"*.*************"
	};
	// A = 0, 1, 2 
	// B = 3,4,5
	// C = 6,7,8
	// D = 9,10,11
	// E = 12,13,14
	static int func(char c) {
		return Math.abs(c - 65) * 3;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String str = br.readLine();
//		String ss = "123456".substring(2, 2+3);
//		System.out.println(ss);
		for (int i = 0; i < strs.length; i++) {
			for (int j = 0, v = 0; j < str.length(); j++) {
				v = func(str.charAt(j));
				sb.append(strs[i].substring(v, v+3));
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}


