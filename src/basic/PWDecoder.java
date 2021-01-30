package basic;

import java.util.Scanner;

public class PWDecoder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] pw = new char[10];
		
		String s = sc.nextLine();
		for (int i = 0; i < pw.length; i++) {
			pw[i] = s.charAt(i);
		}
		
		s = sc.nextLine();
		
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < pw.length; j++) {
				if (s.charAt(i) == ' ') {
					System.out.print(" ");
					break;
				}
				if (pw[j] == s.charAt(i)) {
					System.out.print(j);
				}
			}
		}
	}
}
