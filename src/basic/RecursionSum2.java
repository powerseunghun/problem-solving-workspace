package basic;

import java.util.Scanner;

public class RecursionSum2 {
	public int sum(String s) {
		if (s.equals("")) {
			return 0;
		}
		else {
			int n = s.charAt(0) - 48;
			return n + sum(s.substring(1, s.length())); 
		}
	}
	public static void main(String[] args) {
		String s = new Scanner(System.in).nextLine();
		
		System.out.println(new RecursionSum2().sum(s));
	}
}
