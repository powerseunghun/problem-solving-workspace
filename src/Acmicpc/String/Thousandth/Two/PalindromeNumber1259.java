package Acmicpc.String.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber1259 {
	static String checkPalindrome(String s) {
		for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) return "no\n";
		}
		return "yes\n";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = null;
		StringBuilder sb = new StringBuilder();
		while (true) {
			s = br.readLine();
			if (s.charAt(0) == '0') break;
			sb.append(checkPalindrome(s));
		}
		
		System.out.print(sb.toString());
	}
}
