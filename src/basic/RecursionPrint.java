package basic;

import java.util.Scanner;

public class RecursionPrint {
	public void print(int n) {
		if (n <= 0) return;
		print(n-1);
		System.out.print("*");
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		new RecursionPrint().print(n);
	}
}
