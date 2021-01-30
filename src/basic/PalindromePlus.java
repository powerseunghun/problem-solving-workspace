package basic;

import java.util.Scanner;

public class PalindromePlus {
	public String checkPalindrome(String str) {
		int i, end = str.length() - 1;
		boolean flag = true;
		for (i = 0; i < str.length() / 2; i++) {
			if(str.charAt(i) != str.charAt(end)) {
				flag = false;
			}
			end--;
		}
		if (flag) return "YES";
		else return "NO";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PalindromePlus p = new PalindromePlus();
		int n = sc.nextInt();
		int sum = 0;
		String n1 = n + "";
		String n2 = new StringBuffer(n1).reverse().toString();
		
		sum = Integer.parseInt(n1) + Integer.parseInt(n2);
		String s = p.checkPalindrome(sum + "");
		
		System.out.println(s);
	}
}
