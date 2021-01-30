package basic;

import java.util.Scanner;

public class StringSeparate {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String s1 = null, s2 = null;
		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				idx = i;
				break;
			}
		}
		s1 = s.substring(0, idx);
		s2 = s.substring(idx + 1, s.length());
		
		if (s1.length() == s2.length()) {
			if (s1.compareTo(s2) < 0) {
				System.out.println(s1 + " " + s2);
			}
			else {
				System.out.println(s2 + " " + s1);
			}
		}
		else {
			if (s1.length() <= s2.length()) {
				System.out.println(s1 + " " + s2);
			}
			else {
				System.out.println(s2 + " " + s1);
			}
		}
	}
}
