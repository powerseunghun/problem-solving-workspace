package Practice;

import java.util.Scanner;

public class Palindrome {
	public boolean isPalindrome(String s) {
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
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Palindrome p = new Palindrome();
		int a = sc.nextInt(), b = sc.nextInt(), max = 0;
		
		for (int i = a; i < b; i++) {
			for (int j = i + 1; j <= b; j++) {
				if (p.isPalindrome((i * j) + "")) {
					if ((i * j) >= max) {
						max = i * j;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
