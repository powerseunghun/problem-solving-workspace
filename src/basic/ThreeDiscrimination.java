package basic;

import java.util.Scanner;

public class ThreeDiscrimination {
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += (int) s.charAt(i) - 48;
		}
		if (sum % 3 == 0) System.out.println(1);
		else System.out.println(0);
	}
}
