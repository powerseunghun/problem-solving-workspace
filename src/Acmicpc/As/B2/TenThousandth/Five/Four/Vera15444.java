package Acmicpc.As.B2.TenThousandth.Five.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vera15444 {
	static String[] strs = {
			"***************",
			"*.**.**..*.**..",
			"*******..*.****",
			"*.**.**..*.**..",
			"*.*************"
	};
	static int func(char c) {
		return Math.abs(c - 65) * 3;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br.readLine();
		String str = br.readLine();
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


