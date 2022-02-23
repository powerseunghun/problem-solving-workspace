package Acmicpc.OrderSubmit.TenThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome17609 {
	static boolean check1(String str, int s, int e) {
		while (s <= e) {
			if (str.charAt(s) != str.charAt(e)) return false;
			s++; e--;
		}
		return true;
	}
	static boolean check2(String str, int s, int e) {
		while (s <= e) {
			if (str.charAt(s) != str.charAt(e)) {
				if (!check1(str, s+1, e) && !check1(str, s, e-1)) {
					return false;
				}
				return true;
			}
			s++; e--;
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		for (int i = 0; i < T; i++) {
			str = br.readLine();
			if (check1(str, 0, str.length()-1)) {
				sb.append("0\n");
				continue;
			}
			if (check2(str, 0, str.length()-1)) sb.append("1\n");
			else sb.append("2\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}