package Acmicpc.String.TenThousandth.Zero.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome10988 {
	static int checkPalindrome(String s) {
		for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) return 0;
		}
		return 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(checkPalindrome(br.readLine()));
	}
}
