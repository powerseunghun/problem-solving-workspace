package Acmicpc.As.B2.SixThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HexadecimalConversion6040 {
	static String formatting(String str) {
		while (str.length() % 4 != 0) {
			str = "0" + str;
		}
		return str;
	}
	static int charParse(char c) {
		return c >= '0' && c <= '9' ? c-'0' : c-55;
	}
	static int getVal(String str) {
		int sum = 0;
		for (int i = str.length()-1, idx = 0; i >= 0; i--) {
			sum += charParse(str.charAt(i)) * Math.pow(2, idx++);
		}
		return sum;
	}
	static String getOctaValue(String hexStr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0, w = 0; i < hexStr.length(); i+= 3) {
			w = getVal(hexStr.substring(i, i+3));
			if (w == 0) continue;
			sb.append(w);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), hexStr = null, res = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') continue;
			sb.append(formatting(Integer.toBinaryString(charParse(str.charAt(i)))));
		}
		hexStr = sb.toString();
		while (hexStr.length() % 3 != 0) {
			hexStr = "0" + hexStr;
		}
		
		res = getOctaValue(hexStr);
		System.out.println(res.replaceAll("0", "").length() == 0 ? "0" : res);
		br.close();
	}
}
