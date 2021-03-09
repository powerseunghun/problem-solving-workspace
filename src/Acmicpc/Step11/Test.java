package Acmicpc.Step11;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String p = sc.next();
		String s = sc.next();
		int count = 0, i = 0;
		
		for (i = 0; i <= s.length() - p.length(); ) {
			String subs = s.substring(i, i + p.length());
			
			// last check
			if (i >= s.length() - p.length()) {
				i++;
				count = subs.equals(p) ? count : count + p.length();
			}
			else {
				if (subs.equals(p)) {
					i += p.length();
				}
				else {
					i++;
					count++;
				}
			}
		}
		if (count == s.length()) {
			System.out.println(-1);
		}
		else {
			System.out.println(count);
		}
	}
}
