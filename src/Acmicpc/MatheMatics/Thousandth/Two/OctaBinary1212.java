package Acmicpc.MatheMatics.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OctaBinary1212 {
	static String changeDigit(char c, boolean flag) {
		StringBuilder sb = new StringBuilder();
		int n = c-'0';
		if (n == 0) {
			if (flag) return "0";
			else sb.append("000");
		}
		while (n != 0) {
			sb.append(n % 2);
			n /= 2;
		}
		for (int i = sb.length(); i < 3; i++) {
			sb.append("0");
		}
		
		if (flag) {
			while(sb.toString().charAt(sb.length()-1) == '0') {
				sb.deleteCharAt(sb.length()-1);
				if (sb.length() == 0) {
					sb.append("");
					break;
				}
			}
		}
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			if (i == 0) sb.append(changeDigit(tmp.charAt(i), true));
			else sb.append(changeDigit(tmp.charAt(i), false));
		}
		System.out.println(sb.toString());
	}
}
