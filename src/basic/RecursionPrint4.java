package basic;

import java.util.Scanner;

public class RecursionPrint4 {
	public void print1(int n) {
		if (n <= 0) return;
		print1(n-1);
		System.out.print(n + " ");
	}
	
	public void print2(int n) {
		if (n <= 0) return;
		print2(n-1);
		print1(n);
		System.out.println();
	}
	public static void main(String[] args) {
		new RecursionPrint4().print2(new Scanner(System.in).nextInt());
	}
}
