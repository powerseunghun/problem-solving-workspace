package basic;

import java.util.Scanner;

public class SecretMessage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(), de;
		sc.nextLine();
		String s = sc.nextLine(), d = "";
		for (int i = 0; i < s.length(); i++) {
			de = (int) (s.charAt(i) - ((i + 1) * 3 + k));
			if (de < 65) {
				de = 26 + de;
			}
			d += (char)de;
		}
		System.out.println(d);
	}
}
