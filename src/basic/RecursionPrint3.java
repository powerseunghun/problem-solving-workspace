package basic;

import java.util.Scanner;

public class RecursionPrint3 {
	public void p1(int n) {
		if (n <= 0) return;
		p1(n-1);
		System.out.print("*");
	}
	
	public void p2(int n) {
		if (n <= 0) return;
		p2(n-1);
		p1(n);
		System.out.println();
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		new RecursionPrint3().p2(n);
	}
}
