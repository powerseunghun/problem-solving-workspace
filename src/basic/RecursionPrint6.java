package basic;

import java.util.Scanner;

public class RecursionPrint6 {
	public void print(int n) {
		if (n <= 0) return;
		System.out.println(n);
		print(n-1);
	}
	public static void main(String[] args) {
		new RecursionPrint6().print(new Scanner(System.in).nextInt());
	}
}
