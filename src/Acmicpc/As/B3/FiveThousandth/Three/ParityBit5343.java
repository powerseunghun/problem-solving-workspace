package Acmicpc.As.B3.FiveThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ParityBit5343 {
	static final int len = 8;
	static int func(String str) {
		int calc = 0, pb = 0;
		String subStr = null;
		for (int i = 0; i < str.length(); i+=len) {
			subStr = str.substring(i, i+len);
			pb = subStr.charAt(subStr.length()-1) - '0';
			calc += subStr.substring(0, len-1).replaceAll("0", "").length() % 2 != pb ? 1 : 0;
		}
		return calc;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(func(str) + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
