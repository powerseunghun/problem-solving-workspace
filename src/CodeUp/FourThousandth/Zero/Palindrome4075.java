package CodeUp.FourThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome4075 {
	static boolean checkPalindrome(String str) {
		for (int i = 0, j = str.length()-1; i < str.length()/2; i++, j--) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if (str.charAt(i) != str.charAt(j) && str.charAt(i) != (char)(str.charAt(j)+32)) {
					return false;
				}
			}
			else {
				if (str.charAt(i) != str.charAt(j) && str.charAt(i) != (char)(str.charAt(j)-32)) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer(br.readLine());
		StringBuilder sbd = new StringBuilder();
		
		if (checkPalindrome(sb.toString())) {
			System.out.println("Yes");
			int base = sb.toString().length() % 2 == 0 
					? sb.toString().length()/2 
					: sb.toString().length()/2+1;
			for (int i = 0; i < base; i++) {
				System.out.print(sb.toString().charAt(i));
			}
			System.out.println();
		}
		else {
			sbd.append(sb.toString()+sb.reverse().toString());
			System.out.println("No");
			System.out.println(sbd.toString());
		}
	}
}
