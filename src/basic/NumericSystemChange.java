package basic;

import java.util.Scanner;

public class NumericSystemChange {
	public String getChar(int n, int k) {
		String s = "";
		char[] numeric = new char[]
				{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		if (n == 0) s += "0";
		while(n != 0) {
			s += numeric[n % k];
			n = n / k;
		}
		return new StringBuffer(s).reverse().toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(new NumericSystemChange().getChar(sc.nextInt(), sc.nextInt()));
	} 
}
