package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PartialPalindromeString {
	static boolean checkPalindrome(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine(), tmp = null;
		int max = 1;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j <= str.length(); j++) {
				tmp = str.substring(i, j);
				if (tmp.length() > 1 && checkPalindrome(tmp)) max = Math.max(tmp.length(), max);
			}
		}
		System.out.println(max);
	}
}
