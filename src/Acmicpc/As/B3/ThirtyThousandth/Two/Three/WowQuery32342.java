package Acmicpc.As.B3.ThirtyThousandth.Two.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WowQuery32342 {
	static final String s = "WOW";
	static int func(String str) {
		int res = 0;
		for (int i = 0; i < str.length()-2; i++) {
			res += str.substring(i, i+3).equals("WOW") ? 1 : 0;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int Q = Integer.parseInt(br.readLine());
		String str = null;
		
		while(Q-- > 0) {
			str = br.readLine();
			sb.append(func(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
