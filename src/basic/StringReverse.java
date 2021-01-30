package basic;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
