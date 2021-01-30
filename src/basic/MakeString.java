package basic;

import java.util.Scanner;

public class MakeString {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		String str = "";
		
		for (int i = 0; i < s.length(); i++) {
			switch(s.charAt(i)) {
			case '0':
			case '1':
			case '2':
				str += s.charAt(i);
				break;
			case 'A':
				str = str.substring(0, str.length() - 1);
				break;
			case 'B':
				str = str.substring(0, str.length() - 2);
				break;
			case 'C':
				str = "";
				break;
			}
		}
		System.out.println(str);
	}
}
