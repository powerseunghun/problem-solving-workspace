package Acmicpc.As.B2.TenThousandth.Three.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome13235 {
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(check(str) ? "true" : "false");
		br.close();
	}
}
