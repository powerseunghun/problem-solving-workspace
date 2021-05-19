package CodeUp.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome2204 {
	static boolean isPalindrome(String s) {
		boolean flag = true;
		int f = 0, b = s.length() - 1;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(f) != s.charAt(b)) {
				flag = false;
				break;
			}
			f++; b--;
		}
		return flag;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int a = Integer.parseInt(tmp.split(" ")[0]);
		int b = Integer.parseInt(tmp.split(" ")[1]);
		int max = 0;
		
		for (int i = a; i < b; i++) {
			for (int j = i + 1; j <= b; j++) {
				if (isPalindrome((i * j) + "")) {
					if ((i * j) >= max) {
						max = i * j;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
