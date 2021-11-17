package Goorm.Level4;

import java.io.IOException;

public class FrontSameBack {
	static boolean check(int n) {
		String str = n+"";
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	static boolean check(String str) {
		for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) return false;
		}
		return true;
	}
	static boolean isWantedNumber(int n) {
		String str1 = Integer.toBinaryString(n);
		String str2 = Integer.toOctalString(n);
		
		if (check(str1) && check(str2) && check(n)) return true;
		return false;
	}
	public static void main(String[] args) throws IOException {
		for (int i = 11; ; i+=2) {
			if (isWantedNumber(i)) {
				System.out.println(i);
				break;
			}
		}
	}
}
