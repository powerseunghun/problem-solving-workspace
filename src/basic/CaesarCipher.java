package basic;

import java.util.Scanner;

public class CaesarCipher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pw = sc.nextLine();
		char[] alp = new char[26];
		int i = 0, base = 0;
		for (i = 0; i < alp.length; i++) {
			alp[i] = (char)(97 + i);
		}
		
		for (i = 0; i < pw.length(); i++) {
			if (pw.charAt(i) != 32) {
				base = pw.charAt(i) - 3 - 97;
				if (base < 0 ) {
					System.out.print(alp[alp.length + base]);
				}
				else {
					System.out.print(alp[base]);
				}
			}
			else {
				System.out.print((char)32);
			}
		}
	}
}
