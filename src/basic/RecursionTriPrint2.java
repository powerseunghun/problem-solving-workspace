package basic;

import java.util.Scanner;

public class RecursionTriPrint2 {
	public void p1(int n) {
		if (n <= 0) return;
		System.out.print("*");
		p1(n-1);
	}
	
	public void p2(int n) {
		if (n <= 0) return;
		p1(n);
		System.out.println();
		p2(n-1);
	}
	public static void main(String[] args) {
		int n = new Scanner(System.in).nextInt();
		
		new RecursionTriPrint2().p2(n);
	}
}
