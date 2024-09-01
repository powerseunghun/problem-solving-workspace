package Acmicpc.As.B3.TwentyThousandth.Seven.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Splitology27627 {
	static boolean isPalindrome(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++,j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean flag = false;
		String str = br.readLine();
		for (int i = 1; i < str.length(); i++) {
			if (isPalindrome(str.substring(0, i)) && isPalindrome(str.substring(i, str.length()))) {
				flag = true;
				System.out.println(str.substring(0, i) + " " + str.substring(i, str.length()));
			}
		}
		if (!flag) {
			System.out.println("NO");
		}
		br.close();
	}
}
