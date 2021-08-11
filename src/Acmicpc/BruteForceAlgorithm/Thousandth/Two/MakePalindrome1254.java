package Acmicpc.BruteForceAlgorithm.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakePalindrome1254 {
	static boolean check(String s) {
		for (int i = 0, j = s.length()-1; i <= j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) return false;
		}
		return true;
	}
	static int getPalindromeLength(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (check(s.substring(i))) return s.length()+i;
		}
		return s.length()*2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(getPalindromeLength(br.readLine()));
	}
}
