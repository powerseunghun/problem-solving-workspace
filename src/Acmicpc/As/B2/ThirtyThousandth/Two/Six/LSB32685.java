package Acmicpc.As.B2.ThirtyThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LSB32685 {
	static final int base = 4;
	static String gapSolved(String str) {
		String res = "";
		for (int i = 0; i < base-str.length(); i++) {
			res += "0";
		}
		return res;
	}
	static String func(String str) {
		if (str.length() > 3) {
			return str.substring(str.length()-4, str.length());
		} else {
			return gapSolved(str) + str;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		for (int i = 0; i < 3; i++) {;
			sb.append(func(Integer.toBinaryString(Integer.parseInt(br.readLine()))));
		}
		str = String.valueOf(Integer.parseInt(sb.toString(),2));
		sb = new StringBuilder(str.length() > base ? str : gapSolved(str)+str);
		
		System.out.println(sb.toString());
		br.close();
	}
}
